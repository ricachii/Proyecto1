package tarea1;
import java.util.Date;
import tarea1.OrdenCompra;

abstract class Pago{
    private OrdenCompra orc1;
    private float monto;
    private Date fecha;
    public Pago(OrdenCompra o1){
        orc1 = o1;
    }

    public String toString(){
        return "La fecha de pago es: " + fecha;
    }
    public void setmonto(float m1){
        this.monto = m1;
    }
    public float getmonto(){
        return this.monto;
    }
    public float getPrecio(){
        return orc1.calcPrecio();
    }
    public void setFecha(Date f1){
        fecha = f1;
    }
    public Date getFecha(){
        return fecha;
    }

}
class Efectivo extends Pago{
    public Efectivo(OrdenCompra o2){
        super(o2);
    }
    public float calcDevolucion(){ 
        float x;
        x = getmonto() - getPrecio();
        return x;
    }
    
}
class Transferencia extends Pago{
    private String banco;
    private String numCuenta;
    
    public Transferencia(OrdenCompra o2){
        super(o2);
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
        
        return "Su banco es: " + banco + "\nSu numero de cuenta es: " + numCuenta;
    }
}
class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
   
    public Tarjeta(OrdenCompra o2){
        super(o2);
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
        
        return "Usted tiene una tarjeta de: " + tipo + "\nEl numero de su transaccion es: " + numTransaccion;
    }
}