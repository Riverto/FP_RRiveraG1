/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema17;
import java.util.*;

/**
 *
 * @author Riverto
 */
public class PP2Problema17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
        a=pedirNumero("primer");
        b=pedirNumero("segundo");
        c=divisorComun(a,b);
        mostrarResultado(a,b,c);
        cont();
    }
    public static int pedirNumero(String tipo){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el " + tipo + " valor: ");
        int num=entrada.nextInt();
        return num;
    }
    public static int divisorComun(int a, int b){
        int c=0,m;
        m=a;              //compara y guarda
        if(m>b)m=b; //el valor menor
        for (int i=1;i<=m;i++){
            if (a%i==0&&b%i==0)//busca valores que sean factores de los numeros
                c=i;//guarda el ultimo valor que satisfazca la condición
        }
        return c;
    }
    public static void mostrarResultado(int a,int b,int c){
    System.out.println("El mayor divisor comun de "+a+" y "+b+" es: "+c);//muestra resultado
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
