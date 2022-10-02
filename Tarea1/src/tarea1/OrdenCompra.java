package tarea1;

import java.util.Date;

class OrdenCompra{
    private Date fecha;
    private String estado;
    
    public int calcPrecioSinIVA(){
        return 0;
    }
    public int calcIVA(){
        return 19;
    }
    public int calcPrecio(){
        return 100;
    }
    public int Peso(){
        return 10;
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
}
class DetalleOrden{
   private int cantidad;
   public int calcPrecio(){
       return 100;
   }
   public int calcPrecioSinIVA(){
       return 0;
   }
   public int calcIVA(){
       return 19;
   }
   public int calcPeso(){
       return 10;
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
}
