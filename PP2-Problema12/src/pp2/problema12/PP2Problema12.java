/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema12;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Riverto
 */
public class PP2Problema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []vector = new int[10];
        vector=llenarvector(vector);
        mostrarvector(vector);
        cont();
    }
    public static int[] llenarvector(int[] v){
        Scanner entrada = new Scanner(System.in);
        for(int i=0;i<v.length;i++){
            System.out.print("Introduce un numero para la posicion ["+ (i+1) +"] :");
            v[i]=entrada.nextInt();
        }
    return v;}
    public static void mostrarvector(int[] v){
        int a=0,p=0;
        for (int i=1; i<v.length; i+=2){
            a=v[i]+a;
            p++;
        }
        System.out.println("La media de los numeros en las posiciones pares es: "+(a/p));
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
