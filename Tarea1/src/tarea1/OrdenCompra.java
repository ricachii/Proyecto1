package tarea1;
import java.util.Date;


class OrdenCompra{
    private DetalleOrden det;
    private DocTributario dt;
    private Cliente cl;
    private Date fecha;
    private String estado;
    
    public float calcPrecioSinIVA(){
        return 0;
    }

    public float calcPeso(){
 
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
        
        return "El estado de su compra es: " + estado + " La fecha de compra es: " + fecha;
    }
}
class DetalleOrden{
   private OrdenCompra orc;
   private Articulo ar;
   private int cantidad;
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
        
        return "Descripción del articulo: " + descripcion + " Usred va a llevar un " + nombre;
    }
}
