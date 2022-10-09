package tarea1;
import tarea1.OrdenCompra;
import tarea1.Pago;
import tarea1.DocTributario;
import tarea1.Cliente;
import java.util.Date;

public class Tarea1 {
     public static void main(String[] args) {
         Articulo ar1 = new Articulo();
         ar1.setPeso(5);
         ar1.setPrecio(20);
         ar1.setNombre("Chalas");
         ar1.setDescripcion("Bonitas chalas azules de goma a mitad de precio");
         System.out.println(ar1.toString());
         DetalleOrden v1 = new DetalleOrden(ar1);
         
         v1.calcPrecio();
         v1.calcPrecioSinIVA();
         v1.calcIVA();
         v1.calcPeso();
         v1.setCantidad(1);
         v1.getCantidad();
         System.out.println("Usted ha pedido un/una " +ar1.getNombre()+ " \nSu peso es: " +v1.calcPeso()+ "\nSu precio es: " +v1.calcPrecioSinIVA()+ "\nCon " +v1.calcIVA()+ "% de IVA" +"\nEl total es : " +v1.calcPrecio());
         
         OrdenCompra ord1 = new OrdenCompra(v1);
         ord1.calcIVA();
         ord1.calcPrecio();
         ord1.calcPrecioSinIVA();
         ord1.Peso();
         Date fecha1 = new Date(10, 01, 2022);
         ord1.setFecha(fecha1);
         ord1.getFecha();
         ord1.setEstado("La compra ha sido procesada exitosamente");
         ord1.getEstado();
         String s = ord1.toString();
         System.out.println(s);
        

     }
}
