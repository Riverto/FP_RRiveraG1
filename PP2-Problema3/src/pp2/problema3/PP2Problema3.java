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
        int numero;
        double f;
        numero = pedirNumero();
        f=calcularFactorial(numero);
        System.out.println("El factorial de "+numero+" es: "+f);
        cont();
    }
        public static int pedirNumero(){
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el numero del cual quiere calcular el factorial: ");
        n = teclado.nextInt(); //recibe el numero
        return n;
        }
        public static double calcularFactorial(int n){
            double a=1;
            while(n>0){ //multiplica por n hasta que sea 1
                a = a*n;
                n--; //disminuye n por 1
            }
            return a;
        }
    public static void cont(){
        int resp;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Desea continuar?"); //menu
        System.out.println("1. Si");
        System.out.println("0. No");        
        resp = entrada.nextInt();
        if (resp<0 || resp>1){ //comprobación de respuesta
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
    public static void mensajeSalida(){
        System.out.println("Gracias por usar el programa"); //despedida
        System.exit(0);
    }
}