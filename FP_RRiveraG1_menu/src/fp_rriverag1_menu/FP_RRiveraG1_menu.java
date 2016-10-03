/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_rriverag1_menu;
import java.util.*;
/**
 *
 * @author Riverto
 */
public class FP_RRiveraG1_menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("La opcion elefida es: " +  menu());    
    }
    public static int menu(){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("**** Calculo de areas ****");
        System.out.println("**** Menu ****");
        System.out.println("Introdusca la opcion deseada:");
        System.out.println("Area de cuadrados");
        System.out.println("Area de circulos");
        System.out.println("Area de triangulos");
        opcion = entrada.nextInt();
        }while(opcion<=0 && opcion>=3);
        return opcion;
    }
}
