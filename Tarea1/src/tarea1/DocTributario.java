package tarea1;
import java.util.Date;


abstract class DocTributario {
    private Direccion di;
    private String numero;
    private String rut;
    private Date fecha;
    
    public DocTributario(Direccion d1){
        di = d1;
    }
    
    public void setNumero(String aa){
        this.numero = aa;                
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public void setRut(String ru){
        this.rut = ru;
    }
    public String getRut(){
        return this.rut;
    }
    
    public void setFecha(Date da){
        this.fecha = da;
    }
    public Date getFecha(){
        return this.fecha;
    }
    
    public String toString(){
        return "El numero es: " + this.numero + "\nEl rut es: " + this.rut + "\nLa fecha es: " + this.fecha;
    }
    
}

class Boleta extends DocTributario {
    public Boleta(Direccion d2){
        super(d2);
    }
}

class Factura extends DocTributario {
    public Factura(Direccion d2){
        super(d2);
    }
}
            
