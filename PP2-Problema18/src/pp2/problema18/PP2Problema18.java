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
        a=pedirNumero("primer numero");
        b=pedirNumero("segundo numero");
        c=pedirNumero("tercer numero");
        System.out.println("El minimo comun multiple es: "+minimoMultiple(a, b, c));
    }
    public static int pedirNumero(String tipo){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el " + tipo + " valor: ");
        int num=entrada.nextInt();
        return num;
    }
    public static int minimoMultiple(int a, int b,int c){
        int r=1,m;
        m=a;
        if(m<b)m=b;
        if(m<c)m=c;
        for (int i=2;i<m;i++){
            if (a%i==0||b%i==0||c%i==0){
                r=r*i;
                if (a%i==0) a=a/i;
                if (b%i==0) b=b/i;
                if (c%i==0) c=c/i;
            }
        }
        return r;
    }
}
