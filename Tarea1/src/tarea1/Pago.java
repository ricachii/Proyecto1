package tarea1;
import java.util.Date;

abstract class Pago{
    private OrdenCompra orc1;//Sirve para acceder a los metodos de OrdenCompra
    private float monto;
    private Date fecha;
    public Pago(OrdenCompra o1){//Sirve para inicializar la variable OrdenCompra con un valor
        orc1 = o1;
    }

    public String toString(){ //Sirve para facilitar la descripcion de las variables de Pago
        return "La fecha de pago es: " + fecha;
    }
    public void setmonto(float m1){//Sirve para darle un valor a la variable Monto
        this.monto = m1;
    }
    public float getmonto(){//Retorna el valor de la variable Monto
        return this.monto;
    }
    public float getPrecio(){//Sirve para retornar el precio total de OrdenCompra
        return orc1.calcPrecio();
    }
    public void setFecha(Date f1){//Sirve para darle un valor a la variable fecha
        fecha = f1;
    }
    public Date getFecha(){//Retorna el valor de fecha
        return fecha;
    }

}
class Efectivo extends Pago{
    public Efectivo(OrdenCompra o2){//Sirve para que la subclase Efectivo acceda a los metodos de OrdenCompra
        super(o2);
    }
    public float calcDevolucion(){  //Sirve para calcular la cantidad de dinero a devolver para cuando el monto no es exacto
        float x;
        if(getmonto() > getPrecio()){
            x = getmonto() - getPrecio();
            return x;
            
        }else{
            return 0;
        }
        
       
    }
    
}
class Transferencia extends Pago{
    private String banco;
    private String numCuenta;
    
    public Transferencia(OrdenCompra o2){//Sirve para que la subclase Transferencia acceda a los metodos de OrdenCompra
        super(o2);
    }
    public void setBanco(String bank){//Sirve para asignar el nombre del Banco en el cual ocurre la transferencia
        this.banco = bank;
    }
    public String getBanco(){//Retorna el nombre del Banco
        return banco;
    }
    public void setNumCuenta(String accountNumber){//Asigna el numero de la cuenta a la variable numCuenta
        this.numCuenta = accountNumber;
    }
    public String getNumCuenta(){//Retorna el numero de la variable numCuenta
        return numCuenta;
    }
    public String toString(){ //Sirve para facilitar la descripcion de las variables en el main
        
        return "Su banco es: " + banco + "\nSu numero de cuenta es: " + numCuenta;
    }
}
class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
   
    public Tarjeta(OrdenCompra o2){//Sirve para que la subclase Tarjeta acceda a los metodos de OrdenCompra
        super(o2);
    }
    public void setTipo(String type){ //Asigna el tipo de tarjeta que se usara
        this.tipo = type;
    }
    public String getTipo(){//retorna el tipo de tarjeta
        return tipo;
    }
    public void setNumTransaccion(String num){ //Asigna un valor a la variable numTransaccion
        this.numTransaccion = num;
    }
    public String getNumTransaccion(){ //Retorna el valor de la variable numTransaccion
        return numTransaccion;
    }
    public String toString(){ //Facilita la descripcion de las variables de Tarjeta
        
        return "Usted tiene una tarjeta de: " + tipo + "\nEl numero de su transaccion es: " + numTransaccion;
    }
}