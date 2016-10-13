/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema8;
import java.util.Scanner;

/**
 *
 * @author Riverto
 */
public class PP2Problema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calcularHip(pedirNumero("cateto adyecente"),pedirNumero("cateto opuesto"));
    }
    public static double pedirNumero(String tipo){
    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingrese el "+tipo+" : ");
    double num=entrada.nextDouble();
    return num;
    }
    public static void calcularHip(double ad,double op){
        System.out.println("La hipotenusa es "+Math.sqrt(Math.pow(ad, 2)+Math.pow(op, 2)));
    }
}