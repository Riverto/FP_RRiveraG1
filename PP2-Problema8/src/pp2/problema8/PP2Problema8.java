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
        cont();
    }
    public static double pedirNumero(String tipo){
    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingrese el "+tipo+" : ");
    double num=entrada.nextDouble();
    return num;
    }
    public static void calcularHip(double ad,double op){
        System.out.println("La hipotenusa es "+Math.sqrt(Math.pow(ad, 2)+Math.pow(op, 2)));  //calcula c=sqrt(a^2+b^2)
    }
    public static void mensajeSalida(){
        System.out.println("Gracias por usar el programa"); //despedida
        System.exit(0);
    }
    public static void cont(){
        int resp;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Desea continuar?");
        System.out.println("1. Si");
        System.out.println("0. No");        
        resp = entrada.nextInt();
        if (resp<0 || resp>1){
            cont();} else {
            switch(resp){
                case 1:
                    main(null);
                    break;
                default:
                    mensajeSalida();
                    break;
            }
        }
    }
}