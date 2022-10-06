
package tarea1;

public class Cliente {
    private String nombre;
    private String rut;
    
    public Cliente(){
        
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
        return "Nombre Cliente: " + this.nombre +" Rut: " + this.rut;
    }
    
    
}
class Direccion {
    private String direccion;
    public void setNombre(String s){    
        this.direccion = s;
        
    }
    public String getNombre(){
        return this.direccion;
        
    }
    
    
    public String toString(){
        return "Direccion es: " + this.direccion;
    }
    
}
