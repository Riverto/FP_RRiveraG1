/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema1;
import java.util.*;

/**
 *
 * @author Riverto
 */
public class PP2Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int año;
        año = askAño(); //pide año
        checkLeap(año); //checa año
    }
    public static int askAño(){
        int año;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el año que quiere comprobar: ");
        año = teclado.nextInt(); //recibe el año
        return año;
    }
    public static void checkLeap(int a){
        if ((a % 4) == 0){ //revisa si es divisible por 4
        }
        else{
            System.out.println("El año "+a+" no es bisiesto");
            cont();
        }
        if ((a % 100)==0){ //revisa si es divisible por 100
            
        } else {
            System.out.println("El año "+a+" es bisiesto");
            cont();
        }
        if ((a % 400)==0){ // revisa si es divisible por 400
            System.out.println("El año "+a+" es bisiesto");
            cont();            
        } else {
            System.out.println("El año "+a+" no es bisiesto"); // si no divisible entonces no es bisiesto
            cont();
        }
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
