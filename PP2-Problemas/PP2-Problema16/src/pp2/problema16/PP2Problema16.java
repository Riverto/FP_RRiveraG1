/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema16;
import java.util.Scanner;

/**
 *
 * @author Riverto
 */
public class PP2Problema16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
        a=pedirNumero("a");//piden
        b=pedirNumero("b");//los
        c=pedirNumero("c");//valores
        System.out.println("El numero mayor es : "+encontrarMayor(a,b,c));//nuestra resultado
        cont();
    }
    public static int pedirNumero(String tipo){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el valor " + tipo + " : ");
        int num=entrada.nextInt();
        return num;
    }
    public static int encontrarMayor(int a,int b,int c){
        int m;
        m = a;          //compara
        if(m<b)m=b;//los numeros
        if(m<c)m=c; //y regresa el mayor
        return m;
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
