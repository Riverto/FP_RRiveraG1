/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema3;
import java.util.Scanner;

/**
 *
 * @author Riverto
 */
public class PP2Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero,f;
        numero = pedirNumero();
        f=calcularFactorial(numero);
        System.out.println("El factorial de "+numero+" es: "+f);
    }
        public static int pedirNumero(){
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el numero del cual quiere calcular el factorial: ");
        n = teclado.nextInt(); //recibe los metros
        return n;
        }
        public static int calcularFactorial(int n){
            int a=1;
            while(n>0){ //multiplica por n hasta que sea 1
                a = a*n;
                n--; //disminuye n
            }
            return a;
        }
}