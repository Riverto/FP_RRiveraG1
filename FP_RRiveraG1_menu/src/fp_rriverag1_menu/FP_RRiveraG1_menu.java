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
        System.out.println("La opcion elegida es: " +  menu());    
    }
    public static int menu(){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("**** Calculo de areas ****");
        System.out.println("**** Menu ****");
        System.out.println("1. Area de cuadrados");
        System.out.println("2. Area de circulos");
        System.out.println("3. Area de triangulos");
        System.out.println("0. Salir");
        System.out.print("Introdusca la opcion deseada: ");
        opcion = entrada.nextInt();
        }while(opcion<0 || opcion>3);
        return opcion;
    }
    public static float calcularArea(int op){
        float area;
        switch (op){
            case 1:
                area = areaCuadrado();
            case 2:
                area = areaCirculo();
            case 3:
                area = areaTriangulo();
            default:
                mensajeSalida();
        }
        return area;
    }
    public static float areaCuadrado();
        
}
