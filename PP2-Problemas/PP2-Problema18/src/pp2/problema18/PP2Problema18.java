/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema18;
import java.util.*;

/**
 *
 * @author Riverto
 */
public class PP2Problema18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
        a=pedirNumero("primer numero");     //piden
        b=pedirNumero("segundo numero");   //  los
        c=pedirNumero("tercer numero");      //datos
        System.out.println("El minimo comun multiple es: "+minimoMultiple(a, b, c));//muestra resultado
        cont();
    }
    public static int pedirNumero(String tipo){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el " + tipo + " valor: ");
        int num=entrada.nextInt();
        return num;
    }
    public static int minimoMultiple(int a, int b,int c){
        int d=1,m;
        m=a;                //compara valores
        if(m<b)m=b;    //y guarda el
        if(m<c)m=c;     //valor mas grande
        for (int i=2;i<m;i++){
            int p=0;
            if (a%i==0||b%i==0||c%i==0){//busca valores que sean factores de alguno de los numeros
                if (a%i==0){
                    int p1=0;
                    do {a=a/i;p1++;}
                    while(a%i==0);
                    p=p1;}//reduce el valor si es divisible por el factor y guarda numero de pasos
                if (b%i==0){
                    int p2=0;
                    do {b=b/i;p2++;}
                    while(b%i==0);
                    if(p2>p)p=p2;}//reduce el valor si es divisible por el factor y compara el numero de pasos y guarda el mayor
                if (c%i==0){
                    int p3=0;
                    do {c=c/i;p3++;}
                    while(c%i==0);
                    if(p3>p)p=p3;}//reduce el valor si es divisible por el factor y compara el numero de pasos y guarda el mayor
                d=(int) (d*(Math.pow(i, p)));//guarda el producto de los divisores
            }
        }
        return d;//muestra el producto de los divisores, que es el minimo comun multiple.
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