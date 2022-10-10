package tarea1;
import java.util.Date;

public class Tarea1 {
     public static void main(String[] args) {
         Direccion d1 = new Direccion();
         Date fecha1 = new Date(10, 01, 2022);//Asigna un valor a fecha1 para utilizarlo en el metodo correspondiente
         d1.setDireccion("Tucapel 832");
         d1.getDireccion();
         Cliente p1 = new Cliente(d1);
         p1.setNombre("Ricardo");
         p1.getNombre();
         p1.setRut("20.122.345-9");
         p1.getRut();
         
         Boleta b1 = new Boleta(d1);
         b1.setNumero("000002334");
         b1.getNumero();
         b1.setRut("20.122.345-9");
         b1.getRut();
         b1.setFecha(fecha1);
         b1.getFecha();
         System.out.println(b1.toString());
         
         System.out.println(p1.toString());
         System.out.println(d1.toString());
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
         System.out.println(v1.toString());
         
         OrdenCompra ord1 = new OrdenCompra(v1,p1,b1);
         ord1.calcIVA();
         ord1.calcPrecio();
         ord1.calcPrecioSinIVA();
         ord1.calcPeso();
         ord1.setFecha(fecha1);
         ord1.getFecha();
         ord1.setEstado("La compra ha sido procesada exitosamente");
         ord1.getEstado();
         System.out.println(ord1.toString());
         
         Efectivo t1 = new Efectivo(ord1);
         t1.setmonto(v1.calcPrecio() - 20);
         t1.getmonto();
         t1.getPrecio();
         t1.setFecha(fecha1);
         t1.getFecha();
         float x = t1.getPrecio()- t1.getmonto();//Calcula el monto restante a pagar
         System.out.println(t1.toString()+ "\nEl total de su compra es: " +t1.getPrecio()+ "\nPagara con efectivo la cantidad de: " +t1.getmonto()+ "\nLe faltan " +x+ " del total de la compra, De que manera pagara los " +x+ " que le faltan?");
         System.out.println("Eligio transferencia, ingrese sus datos: ");
         
         Transferencia t4 = new Transferencia(ord1);
         
         t4.setmonto(x);
         t4.getmonto();
         t4.setFecha(fecha1);
         t4.getFecha();
         t4.setBanco("Banco Falabella");
         t4.getBanco();
         t4.setNumCuenta("23211234566");
         t4.getNumCuenta();
         System.out.println(t4.toString()+ "\nEl restante a pagar es: " +x+ "\nPagara con transferencia: " +t4.getmonto());
         
         System.out.print("\n");
         
         Date fecha2 = new Date(12, 05, 2022);//Asigna un valor a fecha2 para utilizarlo en el metodo correspondiente
         Direccion d2 = new Direccion();
         d2.setDireccion("Colon 9000");
         d2.getDireccion();
         Cliente p2 = new Cliente(d2);
         p2.setNombre("Paula");
         p2.getNombre();
         p2.setRut("19.349.283-1");
         p2.getRut();
         System.out.println(p2.toString());
         System.out.println(d2.toString());
         
         Factura b2 = new Factura(d2);
         b2.setNumero("000015132");
         b2.getNumero();
         b2.setRut("19.349.283-1");
         b2.getRut();
         b2.setFecha(fecha2);
         b2.getFecha();
         System.out.println(b2.toString());
         
         
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
         System.out.println(v2.toString());
         
         OrdenCompra ord2 = new OrdenCompra(v2,p2,b2);
         ord2.calcIVA();
         ord2.calcPrecio();
         ord2.calcPrecioSinIVA();
         ord2.calcPeso();
         ord2.setFecha(fecha2);
         ord2.getFecha();
         ord2.setEstado("La compra ha sido procesada exitosamente");
         ord2.getEstado();
         String s1 = ord2.toString();
         System.out.println(s1);
        
         Transferencia t2 = new Transferencia(ord2);
         t2.setmonto(v2.calcPrecio());
         t2.getmonto();
         t2.getPrecio();
         t2.setFecha(fecha2);
         t2.getFecha();
         t2.setBanco("Banco de Chile");
         t2.getBanco();
         t2.setNumCuenta("3438879993");
         t2.getNumCuenta();
         System.out.println(t2.toString()+ "\nEl total de su compra es: " +t2.getPrecio()+ "\nPagara con transferencia: " +t2.getmonto());
         
         System.out.print("\n");
         
         Date fecha3 = new Date(06, 02, 2022);//Asigna un valor a fecha3 para utilizarlo en el metodo correspondiente
         Direccion d3 = new Direccion();
         d3.setDireccion("Paicavi 1082");
         d3.getDireccion();
         Cliente p3 = new Cliente(d3);
         p3.setNombre("Chris");
         p3.getNombre();
         p3.setRut("21.782.111-k");
         p3.getRut();
         System.out.println(p3.toString());
         System.out.println(d3.toString());
         
         Boleta b3 = new Boleta(d3);
         b3.setNumero("100023232");
         b3.getNumero();
         b3.setRut("21.782.111-k");
         b3.getRut();
         b3.setFecha(fecha3);
         b3.getFecha();
         System.out.println(b3.toString());
         
         
         Articulo ar3 = new Articulo();
         ar3.setPeso(10);
         ar3.setPrecio(10);
         ar3.setNombre("Papas Fritas");
         ar3.setDescripcion("Bolsa de papas fritas tamaño familiar");
         System.out.println(ar3.toString());
         
         
         Articulo ar4 = new Articulo();
         ar4.setPeso(20);
         ar4.setPrecio(100);
         ar4.setNombre("Televisor");
         ar4.setDescripcion("Televisor Lg 30 pulgadas");
         System.out.println(ar4.toString());
         
         Articulo ar5 = new Articulo();
         ar5.setPeso(10);
         ar5.setPrecio(40);
         ar5.setNombre("Poleron");
         ar5.setDescripcion("Poleron nike deportivo negro");
         System.out.println(ar5.toString());
         
                                                     
         
         DetalleOrden v3 = new DetalleOrden(ar3);

         v3.calcPrecio();
         v3.calcPrecioSinIVA();
         v3.calcIVA();
         v3.calcPeso();
         v3.setCantidad(10);
         v3.getCantidad();
         System.out.println(v3.toString());
         
         DetalleOrden v4 = new DetalleOrden(ar4);
         v4.calcPrecio();
         v4.calcPrecioSinIVA();
         v4.calcIVA();
         v4.calcPeso();
         v4.setCantidad(2);
         v4.getCantidad();
         System.out.println(v4.toString());
         
         DetalleOrden v5 = new DetalleOrden(ar5);
         v5.calcPrecio();
         v5.calcPrecioSinIVA();
         v5.calcIVA();
         v5.calcPeso();
         v5.setCantidad(1);
         v5.getCantidad();
         System.out.println(v5.toString()); 
         
         OrdenCompra ord3 = new OrdenCompra(v3,p3,b3);
         ord3.setDetalleOrden(v4);
         ord3.setDetalleOrden(v5);
         ord3.calcIVA();
         ord3.calcPrecio();
         ord3.calcPrecioSinIVA();
         ord3.calcPeso();
         ord3.setFecha(fecha3);
         ord3.getFecha();
         ord3.setEstado("La compra ha sido procesada exitosamente");
         ord3.getEstado();
         String s2 = ord3.toString();
         System.out.println(s2);
         
         
         Tarjeta t3 = new Tarjeta(ord3);
         t3.setmonto(v3.calcPrecio());
         t3.getmonto();
         t3.getPrecio();
         t3.setFecha(fecha3);
         t3.getFecha();
         t3.setTipo("Tarjeta de Credito");
         t3.getTipo();
         t3.setNumTransaccion("2323554500");
         t3.getNumTransaccion();
         System.out.println(t3.toString()+ "\nEl total de su compra es: " +t3.getPrecio()+ "\nPagara con " +t3.getTipo()+ ": " +t3.getmonto());
         
        
        

     }
}
