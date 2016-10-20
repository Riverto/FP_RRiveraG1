/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema5;
import java.util.Scanner;

/**
 *
 * @author Riverto
 */
public class PP2Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        numero = pedirNumero();
        resultado(checarPrimo(numero),numero);
        cont();
    }
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el numero que quiere comprobar: ");
        int num=entrada.nextInt();
        return num;
    }
    public static boolean checarPrimo(int n){
        if (n<2) return false; //si es menos de 2 no es primo
        if(n==2) return true; //si es 2 es primo
        if(n%2==0) return false; //si es par no es primo
        for(int i=3;i*i<n;i+=2){
            if (n%i==0) return false; //checa todos los numeros hasta antes de la raiz del numero
        }
            return true;
    }
    public static void resultado(boolean fot,int n){//imprime si es primo
        if(fot==true){
            System.out.println("El numero "+n+" es primo.");
        } else {
            System.out.println("El numero "+n+" no es primo.");
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
