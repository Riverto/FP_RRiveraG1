/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema9;
import java.util.Scanner;

/**
 *
 * @author Riverto
 */
public class PP2Problema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        num=pedirNumero();
        comp(num);
        cont();
    }
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el numero del que quiere los componentes: ");
        int num=entrada.nextInt();
        return num;
    }
    public static void comp(int n){
        System.out.print(n+" = ");
        for(int i=10;i<n*10;i=i*10){
            System.out.print(((n%i)/(i/10))*(i/10));//obtiene el valor de el digito en la posicion i
            if ((i<n))System.out.print(" + ");
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