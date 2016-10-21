/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema19;
import java.util.*;

/**
 *
 * @author Riverto
 */
public class PP2Problema19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a=pedirNumero("angulo");
        mostrarResultado(a);
        cont();
    }
    public static double pedirNumero(String tipo){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el " + tipo + " : ");
        double num=entrada.nextInt();
        return num;
    }
    public static void mostrarResultado(double a){
        double b = Math.toRadians(a);//pasar el dato a radianes para usarlo con el metodo
        System.out.println("El coseno de "+a+" es: "+Math.round((Math.cos(b))*100.0)/100.0);//calcula coseno y muestra el resultado redondeado
        System.out.println("El seno de "+a+" es: "+Math.round((Math.sin(b))*100.0)/100.0);//calcula seno y muestra el resultado redondeado
        System.out.println("La tangente de "+a+" es: "+Math.round((Math.tan(b))*100.0)/100.0);//calcula tangente y muestra el resultado redondeado
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