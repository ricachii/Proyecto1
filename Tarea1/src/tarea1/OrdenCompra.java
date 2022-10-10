package tarea1;
import java.util.Date;
import java.util.ArrayList;


class OrdenCompra{
    private ArrayList<DetalleOrden> det; //Sirve poder almacenar varias varialble tipo DetalleOrden
    private DetalleOrden det1; //Sirve para acceder a los metodos de la clase DetalleOrden
    private DocTributario dt; //Sirve para acceder a los metodos de la clase DocTributario
    private Cliente cl;// Sirve para acceder a los metodos de la clase Cliente
    private Date fecha;
    private String estado;
    
    public OrdenCompra(DetalleOrden det1,Cliente p1,DocTributario t1){
        det = new ArrayList<DetalleOrden>();
        det.add(det1);
        cl = p1;
        dt = t1;
    }
    
    public void setDetalleOrden(DetalleOrden dett){
        det.add(dett);
        
    }
    
    public float calcPrecioSinIVA(){
        float m=0;
        for(int i = 0; i < det.size(); ++i){
            det1 = det.get(i);
            m += det1.calcPrecioSinIVA();           
        }
        return m;
    }

    public float calcPeso(){
        float m=0;
        for(int i = 0; i < det.size(); ++i){
            det1 = det.get(i);
            m += det1.calcPeso();           
        }
        return m;      
    }
    public float calcIVA(){
        float m=0;
        for(int i = 0; i < det.size(); ++i){
            det1 = det.get(i);
            m += det1.calcIVA();
        }
        return m;
    }
    public float calcPrecio(){
        float m=0;
        for(int i = 0; i < det.size(); ++i){
            det1 = det.get(i);
            m += det1.calcPrecio();           
        }
        return m;
    }
   
    public void setFecha(Date f){ //Es para asignar la fecha a la variable fecha
        this.fecha = f;
    }
    public Date getFecha(){//retorna fecha
        return fecha;
    }
    public void setEstado(String s){//Asignar estado a la variable estado
        this.estado = s;
    }
    public String getEstado(){//retornar el estado
        return estado;
    }
    public String toString(){//Describe las variables String para ahorrar trabajo en el main
        
        return "El estado de su compra es: " + estado + ", la fecha de compra es: " + fecha;
    }
}
class DetalleOrden{
   private Articulo ar;//Sirve para acceder a los metodos de la clase Articulo
   private int cantidad;
   public DetalleOrden(Articulo ar1){
       ar=ar1;
   }
   
   
   public float calcPrecio(){
       return cantidad * ar.getPrecio() * (float) 1.19;
   }
   public float calcPrecioSinIVA(){
       return cantidad * ar.getPrecio();
   }
   public float calcIVA(){
       return cantidad *(float) 19;
   }
   public float calcPeso(){
       return cantidad * ar.getPeso();
   }
   public void setCantidad(int z){ //Asigna el numero de productos 
       this.cantidad = z;
   }
   public int getCantidad(){ //retorna el numero de productos
       return cantidad;
   }
   public String toString(){ //Describe las variables mas facilmente en el main 
        
        return "Usted ha pedido un/unas " +ar.getNombre()+ " \nSu peso es: " +calcPeso()+ "\nSu precio es: " +calcPrecioSinIVA()+ "\nCon " +calcIVA()+ "% de IVA" +"\nEl total es : " +calcPrecio();
    }
   
}
class Articulo{
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;
    public Articulo(){ //Metodo constructor de Articulo
        
    }
    
    public void setPeso(float x){//Asigna el peso a la variable peso
        this.peso = x;
    }
    public float getPeso(){//retorna el peso
        return peso;
    }
    public void setNombre(String name){ //Asigna el nombre a la variable string name
        this.nombre = name;
    }
    public String getNombre(){//retorna la variable string name
        return nombre;
    }
    public void setDescripcion(String des){//Asigna la descripcion del producto
        this.descripcion = des;
    }
    public String getDescripcion(){//Retorna la descripcion del producto
        return descripcion;
    }
    public void setPrecio(float cash){//Asigna el precio del producto
        this.precio = cash;
    }
    public float getPrecio(){//Retorna la variable cash 
        return precio;
    }
    public String toString(){ //Describle las variables string
        
        return "Usted va a llevar un/una: " + nombre + " , Descripcion del articulo: " + descripcion;
    }
}
