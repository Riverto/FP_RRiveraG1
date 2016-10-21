/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema10;
import java.util.*;
/**
 *
 * @author Riverto
 */
public class PP2Problema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int num;
        num = pedirNumero();
        fiboSeq(num);
        cont();
    }
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el numero de terminos que desea: ");
        int num=entrada.nextInt();
        if(num<=1) {
            System.out.println("El numero debe ser mayor a 1");
            pedirNumero();
        }
        return num;
    }
    public static void fiboSeq(int n){//secuencia de fibonacci
        int f1=1,f2=1;
        System.out.println("Los primeros "+n+" digitos de la serie de Fibonacci son: ");
        System.out.print("0 "+f1+" ");
        for(int i=2;i<n;i++){
            System.out.print(f2+" ");
            f2 = f1 + f2;
            f1 = f2 - f1;
        }
        System.out.println("");
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