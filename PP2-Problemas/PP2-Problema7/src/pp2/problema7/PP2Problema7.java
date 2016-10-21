/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema7;
import java.util.Scanner;

/**
 *
 * @author Riverto
 */
public class PP2Problema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        khTOms(pedirNumero("numero de kilometros"));
        cont();
    }
    public static double pedirNumero(String tipo){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el "+tipo+" : ");
        double num=entrada.nextDouble();
        return num;
    }
    public static void khTOms(double k){
        System.out.println(k+"km/h en m/s es "+k/3.6);//convierte km/hora a m/seg
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