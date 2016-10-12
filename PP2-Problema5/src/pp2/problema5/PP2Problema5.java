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
    }
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el numero que quiere comprobar: ");
        int num=entrada.nextInt();
        return num;
    }
    public static boolean checarPrimo(int n){
        if (n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i*i<n;i+=2){
            if (n%i==0) return false;
        }
            return true;
    }
    public static void resultado(boolean fot,int n){
        if(fot==true){
            System.out.println("El "+n+" es primo");
        } else {
            System.out.println("El "+n+" no es primo");
        }
    }
}
