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
        int o;
        o = menu();
        System.out.println("La opcion elegida es: " +  o);
        System.out.println(calcularArea(o));
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
        area=0; //para que no se queje el IDE
        switch (op){
            case 1:
                area = areaCuadrado();
                return area;
            case 2:
                area = areaCirculo();
                return area;
            case 3:
                area = areaTriangulo();
                return area;
            default:
                mensajeSalida();
        }
        return area;
    }
    public static double solicitarDatos(String tipo){
        double dato;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el valor de " + tipo + " : ");
        dato = entrada.nextDouble();
        return dato;
    }
    public static float areaCuadrado(){
        float area;
        double a;
        a = solicitarDatos("un lado");
        area = (float) Math.pow(a, 2);
        return area;
        }
    public static float areaCirculo(){
        float area;
        double r;
        final double pi;
        pi = 3.14;
        r = solicitarDatos("el radio");
        area = (float) (pi*Math.pow(r, 2));
        return area;
    }
    public static float areaTriangulo(){
        float area;
        double b,h;
        b = solicitarDatos("la base");
        h = solicitarDatos("la altura");
        area = (float)(b*h/2);
        return area;
    }
    public static void mensajeSalida(){
        System.out.println("Gracias por usar el programa");
        System.exit(0);
    }
}