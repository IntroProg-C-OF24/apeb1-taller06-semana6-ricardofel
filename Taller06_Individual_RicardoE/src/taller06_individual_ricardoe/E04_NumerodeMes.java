/*
Convertir un número de mes a nombre.
 */
package taller06_individual_ricardoe;
/**
 * @author RICARDO FABIAN ESPINOSA LARGO
 */
import java.util.Scanner;
public class E04_NumerodeMes {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int numeroMes;
        System.out.println("Hola estimado usuario");
        System.out.println("A continuacion ingresa un numero del 1 al 12 [1 es Enero, 2 es Febrero, etc]");
        numeroMes = tc.nextInt();
        System.out.println("===========================");
        switch (numeroMes){
            case 1:
                System.out.println("ENERO");
                break;
            case 2:
                System.out.println("FEBRERO");
                break;
            case 3:
                System.out.println("MARZO");
                break;
            case 4:
                System.out.println("ABRIL");
                break;
            case 5:
                System.out.println("MAYO");
                break;
            case 6:
                System.out.println("JUNIO");
                break;
            case 7:
                System.out.println("JULIO");
                break;
            case 8:
                System.out.println("AGOSTO");
                break;
            case 9:
                System.out.println("SEPTIEMBRE");
                break;
            case 10:
                System.out.println("OCTUBRE");
                break;
            case 11:
                System.out.println("NOVIEMBRE");
                break;
            case 12:
                System.out.println("DICIEMBRE");
                break;
            default:
                System.out.println("El numero no esta dentro del rango pedido");
        }
    }
}
