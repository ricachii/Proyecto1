package tarea1;
import java.util.Date;

abstract class Pago{
    private float monto;
    private Date fecha;
    public Pago(){
                    }
    public String toString(){
        
        return "La fecha de pago es: " + fecha;
    }
}
class Efectivo extends Pago{
    public Efectivo(){
        super();
    }
    public float calcDevolucion(){ //No se aceptan devoluciones
        return 0; 
    }
}
class Transferencia extends Pago{
    private String banco;
    private String numCuenta;
    
    public Transferencia(){
        super();
    }
    public void setBanco(String bank){
        this.banco = bank;
    }
    public String getBanco(){
        return banco;
    }
    public void setNumCuenta(String accountNumber){
        this.numCuenta = accountNumber;
    }
    public String getNumCuenta(){
        return numCuenta;
    }
    public String toString(){
        
        return "Su banco es: " + banco + " Su numero de cuenta es: " + numCuenta;
    }
}
class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
   
    public Tarjeta(){
        super();
    }
    public void setTipo(String type){
        this.tipo = type;
    }
    public String getTipo(){
        return tipo;
    }
    public void setNumTransaccion(String num){
        this.numTransaccion = num;
    }
    public String getNumTransaccion(){
        return numTransaccion;
    }
    public String toString(){
        
        return "Usted tiene una tarjeta de: " + tipo + " El numero de su transaccion es: " + numTransaccion;
    }
}