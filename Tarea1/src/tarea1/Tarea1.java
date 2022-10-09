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
         System.out.println("Usted ha pedido un/unas " +ar1.getNombre()+ " \nSu peso es: " +v1.calcPeso()+ "\nSu precio es: " +v1.calcPrecioSinIVA()+ "\nCon " +v1.calcIVA()+ "% de IVA" +"\nEl total es : " +v1.calcPrecio());
         
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
         
         System.out.print("\n");
         
         Articulo ar2 = new Articulo();
         ar2.setPeso(1);
         ar2.setPrecio(5);
         ar2.setNombre("Galletas");
         ar2.setDescripcion("Galletas sabor a Coco");
         System.out.println(ar2.toString());
         DetalleOrden v2 = new DetalleOrden(ar2);
         
          v2.calcPrecio();
         v2.calcPrecioSinIVA();
         v2.calcIVA();
         v2.calcPeso();
         v2.setCantidad(5);
         v2.getCantidad();
         System.out.println("Usted ha pedido un/uns " +ar2.getNombre()+ " \nSu peso es: " +v2.calcPeso()+ "\nSu precio es: " +v2.calcPrecioSinIVA()+ "\nCon " +v2.calcIVA()+ "% de IVA" +"\nEl total es : " +v2.calcPrecio());
         
         OrdenCompra ord2 = new OrdenCompra(v2);
         ord2.calcIVA();
         ord2.calcPrecio();
         ord2.calcPrecioSinIVA();
         ord2.Peso();
         Date fecha2 = new Date(12, 05, 2022);
         ord2.setFecha(fecha2);
         ord2.getFecha();
         ord2.setEstado("La compra ha sido procesada exitosamente");
         ord2.getEstado();
         String s1 = ord2.toString();
         System.out.println(s1);
         
         System.out.print("\n");
         
         Articulo ar3 = new Articulo();
         ar3.setPeso(10);
         ar3.setPrecio(10);
         ar3.setNombre("Papas Fritas");
         ar3.setDescripcion("Bolsa de papas fritas tamaño familiar");
         System.out.println(ar3.toString());
         DetalleOrden v3 = new DetalleOrden(ar3);
         
         v3.calcPrecio();
         v3.calcPrecioSinIVA();
         v3.calcIVA();
         v3.calcPeso();
         v3.setCantidad(10);
         v3.getCantidad();
         System.out.println("Usted ha pedido un/unas " +ar3.getNombre()+ " \nSu peso es: " +v3.calcPeso()+ "\nSu precio es: " +v3.calcPrecioSinIVA()+ "\nCon " +v3.calcIVA()+ "% de IVA" +"\nEl total es : " +v3.calcPrecio());
         
         OrdenCompra ord3 = new OrdenCompra(v3);
         ord3.calcIVA();
         ord3.calcPrecio();
         ord3.calcPrecioSinIVA();
         ord3.Peso();
         Date fecha3 = new Date(06, 02, 2022);
         ord3.setFecha(fecha3);
         ord3.getFecha();
         ord3.setEstado("La compra ha sido procesada exitosamente");
         ord3.getEstado();
         String s2 = ord3.toString();
         System.out.println(s2);
        
        

     }
}
