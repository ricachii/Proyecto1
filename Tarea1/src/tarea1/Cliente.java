
package tarea1;

public class Cliente {
    private String nombre;
    private String rut;
    private Direccion location;
    
    public Cliente(Direccion l1){
        location = l1;
    }
    
    public void setNombre(String s){
        
        this.nombre = s;
        
    }
    public String getNombre(){
        return this.nombre;
        
    }
    
    public void setRut(String z){
        
        this.rut = z;
        
    }
    public String getRut(){
        return this.rut;
        
    }
    
    
    public String toString(){
        return "Nombre Cliente: " + this.nombre +"\nRut: " + this.rut;
    }
    
    
}
class Direccion {
    private String direccion;
    public void setDireccion(String s){    
        this.direccion = s;
        
    }
    public String getDireccion(){
        return this.direccion;
        
    }
    
    
    public String toString(){
        return "Direccion es: " + this.direccion;
    }
    
}
