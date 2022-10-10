package tarea1;
import java.util.Date;


abstract class DocTributario {
    private Direccion di; //Sirve para acceder a los metodos de la clase Direccion
    private String numero;
    private String rut;
    private Date fecha;
    
    public DocTributario(Direccion d1){ //Sirve para inicializar un valor a la variable Direccion
        di = d1;
    }
    
    public void setNumero(String aa){ //Sirve para asignar un valor la variable numero
        this.numero = aa;                
    }
    
    public String getNumero(){//Retorna el valor de numero
        return this.numero;
    }
    
    public void setRut(String ru){//Sirve para asignar un valor a la variable Rut
        this.rut = ru;
    }
    public String getRut(){//retorna eñ valor de la variable rut
        return this.rut;
    }
    
    public void setFecha(Date da){ //Asigna un valor a la variable fecha
        this.fecha = da;
    }
    public Date getFecha(){ //Retorna el valor de la variable Fecha
        return this.fecha;
    }
    
    public String toString(){//facilita la descripcion de las variables de DocTributario
        return "El numero es: " + this.numero + "\nEl rut es: " + this.rut + "\nLa fecha es: " + this.fecha;
    }
    
}

class Boleta extends DocTributario {
    public Boleta(Direccion d2){ //Sirve para que las sublclases puedan acceder a los metodos de la superclase
        super(d2);
    }
}

class Factura extends DocTributario {
    public Factura(Direccion d2){//Sirve para que las sublclases puedan acceder a los metodos de la superclase
        super(d2);
    }
}
            
