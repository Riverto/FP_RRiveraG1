/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema20;
import java.util.*;

/**
 *
 * @author Riverto
 */
public class PP2Problema20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
        a=pedirNumero("primer dato");
        b=pedirNumero("segundo dato");
        esAmigo(a,b);
        cont();
    }
    public static int pedirNumero(String tipo){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el "+tipo+": ");
        int dato=entrada.nextInt();
        return dato;
    }
    public static void esAmigo(int a, int b){
        int r=1;
        for(int i=2;i<a;i++){
            if(a%i==0){//suma los factores de un valor
                r=r+i;
            }
        }
        if(r==b){//si la suma es igual a el 2do valor el numero es amigo, en caso contrario, no lo es.
            System.out.println("El numero "+a+" es amigo de "+b+".");
        } else {
            System.out.println("El numero "+a+" no es amigo de "+b+".");
        }
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