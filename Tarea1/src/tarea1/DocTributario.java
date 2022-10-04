package tarea1;
import java.util.Date;


public class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
    
    public void setNumero(String aa){
        this.numero = aa;
                
    }
    
    public void setRut(String ru){
        this.rut = ru;
    }
    
    public void setFecha(Date da){
        this.fecha = da;
    }
    
    public String toString(){
        return "El numero es: " + this.numero + " el rut es: " + this.rut + " la fecha es: " + this.fecha;
    }
    
}

class Boleta extends DocTributario {
    public Boleta(){
        
    }
}

class Factura extends DocTributario {
    public Factura(){
        
    }
}
            
