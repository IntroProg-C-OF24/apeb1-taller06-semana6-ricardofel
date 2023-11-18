/*
EJERCICIO 01: Facturación de 2 productos.
*/
package taller06_individual_ricardoe;
/**
 * @author RICARDO FABIAN ESPINOSA LARGO
 */
import java.util.Scanner;
public class E01_FacturacionDosProductos {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double costoProducto1, totalProducto1, costoProducto2, totalProducto2, subTotal, total, descuento, gastoEnvio, IVA, submasIva;
        int unidadesP1, unidadesP2;
        System.out.println("Hola estimado usuario, a continuacion ingresa el costo y las unidades de los productos que adquiriste:");
        System.out.println("Ingresa el costo del primer producto, si no lo compraste ingresa 0");
        costoProducto1 = tc.nextDouble();
        System.out.println("Cuantas unidades de ese producto adquiriste?");
        unidadesP1 = tc.nextInt();
        System.out.println("Ingresa el costo del segundo producto, si no lo compraste ingresa 0");
        costoProducto2 = tc.nextDouble();
        System.out.println("Cuantas unidades de ese producto adquiriste?");
        unidadesP2 = tc.nextInt();
        System.out.println("Ingresa el costo del envio");
        gastoEnvio = tc.nextDouble();
        totalProducto1 = costoProducto1 * unidadesP1;
        totalProducto2 = costoProducto2 * unidadesP2;
        total = totalProducto1 + totalProducto2;
        subTotal = totalProducto1 + totalProducto2;
        if (total <= 1000){
            IVA = total * 0.12;
            submasIva = subTotal + IVA;
            descuento = submasIva * 0.05;
            total = total - descuento + IVA + gastoEnvio;
        } else if (total <= 5000){
            IVA = total * 0.12;
            submasIva = subTotal + IVA;
            descuento = submasIva * 0.2;
            total = total - descuento + IVA + gastoEnvio;
        } else {
            IVA = total * 0.12;
            submasIva = subTotal + IVA;
            descuento = submasIva * 0.2;
            total = total - descuento + IVA;
            gastoEnvio = 0;
        }
        System.out.println("==================FACTURA==================");
        System.out.println("Producto 1: " + costoProducto1 + " Subtotal 1: " + totalProducto1);
        System.out.println("Producto 2: " + costoProducto2 + " Subtotal 2: " + totalProducto2);
        System.out.println("Subtotal: " + subTotal);
        System.out.println("IVA: " + IVA);
        System.out.println("Subtotal + IVA: " + submasIva);
        System.out.println("Descuento: " + descuento);
        System.out.println("Gasto de envio: " + gastoEnvio);
        System.out.println("TOTAl: $" + total);
    }   
}