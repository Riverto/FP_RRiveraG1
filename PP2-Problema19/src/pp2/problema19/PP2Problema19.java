/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema19;
import java.util.*;

/**
 *
 * @author Riverto
 */
public class PP2Problema19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a=pedirNumero("angulo");
        mostrarResultado(a);
    }
    public static double pedirNumero(String tipo){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el " + tipo + " : ");
        double num=entrada.nextInt();
        return num;
    }
    public static void mostrarResultado(double a){
        double b = Math.toRadians(a);
        System.out.println("El coseno de "+a+" es: "+Math.cos(b));
        System.out.println("El seno de "+a+" es: "+(Math.sin(b)));
        System.out.println("La tangente de "+a+" es: "+(Math.tan(b)));
    }
}