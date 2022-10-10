
package tarea1;

public class Cliente {
    private String nombre;
    private String rut;
    private Direccion location;//Sirve para poder acceder a los elementos de la clase Direccion
    
    public Cliente(Direccion l1){//Asigna a la variable direccion la direccion del cliente
        location = l1;
    }
    
    public void setNombre(String s){ //Asigna a la variable nombre el nombre del cliente
        
        this.nombre = s;
        
    }
    public String getNombre(){//retorna el nombre del cliente
        return this.nombre;
        
    }
    
    public void setRut(String z){ //Asigna a la variable Rut el rut del cliente 
        
        this.rut = z;
        
    }
    public String getRut(){//retorna la variable rut
        return this.rut;
        
    }
    
    
    public String toString(){//Describe las variable string de la clase
        return "Nombre Cliente: " + this.nombre +"\nRut: " + this.rut;
    }
    
    
}
class Direccion {
    private String direccion;
    public void setDireccion(String s){ //Asigna a un valor a la variable direccion    
        this.direccion = s;
        
    }
    public String getDireccion(){//retorna la variable direccion
        return this.direccion;
        
    }
    
    
    public String toString(){ //Metodo para facilitar la entrega de datos en el main
        return "Direccion es: " + this.direccion;
    }
    
}
