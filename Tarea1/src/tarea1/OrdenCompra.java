package tarea1;
import java.util.Date;


class OrdenCompra{
    private DetalleOrden det;
    private DocTributario dt;
    private Cliente cl;
    private Date fecha;
    private String estado;
    
    public OrdenCompra(DetalleOrden det1){
        det = det1;
    }
    
    public float calcPrecioSinIVA(){
        return det.calcPrecioSinIVA();
    }
    public float calcIVA(){
        return det.calcIVA();
    }
    public float calcPrecio(){
        return det.calcPrecio();
    }
    public float Peso(){
        return det.calcPeso();
    }
    public void setFecha(Date f){
        this.fecha = f;
    }
    public Date getFecha(){
        return fecha;
    }
    public void setEstado(String s){
        this.estado = s;
    }
    public String getEstado(){
        return estado;
    }
    public String toString(){
        
        return "El estado de su compra es: " + estado + ", la fecha de compra es: " + fecha;
    }
}
class DetalleOrden{
   private OrdenCompra orc;
   private Articulo ar;
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
   public void setCantidad(int z){
       this.cantidad = z;
   }
   public int getCantidad(){
       return cantidad;
   }
}
class Articulo{
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;
    public Articulo(){
        
    }
    
    public void setPeso(float x){
        this.peso = x;
    }
    public float getPeso(){
        return peso;
    }
    public void setNombre(String name){
        this.nombre = name;
    }
    public String getNombre(){
        return nombre;
    }
    public void setDescripcion(String des){
        this.descripcion = des;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setPrecio(float cash){
        this.precio = cash;
    }
    public float getPrecio(){
        return precio;
    }
    public String toString(){
        
        return "Usted va a llevar un/una: " + nombre + " , Descripcion del articulo: " + descripcion;
    }
}
