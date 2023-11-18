/*
EJERCICIO 02: Clasificación de un triángulo.
 */
package taller06_individual_ricardoe;
/**
 * @author RICARDO FABIAN ESPINOSA LARGO
 */
import java.util.Scanner;
public class E02_ClasificacionTriangulo {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double lado1, lado2, lado3, sumaDosLados1, sumaDosLados2, sumaDosLados3;
        System.out.println("Hola estimado usuario, a continuacion ingresa el valor de los tres lados de tu traingulo");
        System.out.println("Ingresa el lado 1");
        lado1 = tc.nextDouble();
        System.out.println("Ingresa el lado 2");
        lado2 = tc.nextDouble();
        System.out.println("Ingresa el lado 3");
        lado3 = tc.nextDouble();
        sumaDosLados1 = lado1 + lado2;
        sumaDosLados2 = lado1 + lado3;
        sumaDosLados3 = lado2 + lado3;
        System.out.println("===============================");
        if ((sumaDosLados1 < lado3) || (sumaDosLados2 < lado2) || (sumaDosLados3 < lado1)){
            System.out.println("No es triangulo");
        } else if ((lado1 == lado2) && (lado2 == lado3)){
            System.out.println("Tu triangulo es equilatero");
        } else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)){
            System.out.println("Tu triangulo es isosceles");
        } else if ((lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3)){
            System.out.println("Tu triangulo es escaleno");
        }    
    }
}