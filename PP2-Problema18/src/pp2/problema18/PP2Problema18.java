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
            if (a%i==0||b%i==0||c%i==0){//busca valores que sean factores de alguno de los numeros
                d=d*i;//guarda el producto de los divisores
                if (a%i==0) a=a/i;//reduce el valor si es divisible por el factor
                if (b%i==0) b=b/i;//reduce el valor si es divisible por el factor
                if (c%i==0) c=c/i;//reduce el valor si es divisible por el factor
            }
        }
        return d;//muestra el producto de los divisores, que es el minimo comun multiple.
    }
}