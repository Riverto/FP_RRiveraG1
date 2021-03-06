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
        int o,r;
        o = menu();
        System.out.println("El area de su "+mostrarForma(o)+" : "+calcularArea(o)); //muestra resultados
        cont();
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
        System.out.println("La opcion elegida es: " +  opcion);
        return opcion;
    }
    public static float calcularArea(int op){
        float area;
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
                area=0;
        }
        return area;
    }
        public static String mostrarForma(int op){
        String forma;
        switch (op){
            case 1:
                forma = "cuadrado";
                return forma;
            case 2:
                forma = "circulo";
                return forma;
            case 3:
                forma = "cuadrado";
                return forma;
            default:
                forma="";
        }
        return forma;
    }
    public static double solicitarDatos(String tipo){ //pide datos con el nombre que se le entregue
        double dato;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el valor de " + tipo + " : ");
        dato = entrada.nextDouble();
        return dato;
    }
    public static float areaCuadrado(){
        float area;
        double a;
        a = solicitarDatos("un lado"); //pide dato
        area = (float) Math.pow(a, 2); //calcula
        return area;
        }
    public static float areaCirculo(){
        float area;
        double r;
        final double pi;
        pi = 3.14;
        r = solicitarDatos("el radio"); //pide dato
        area = (float) (pi*Math.pow(r, 2)); //calcula
        return area;
    }
    public static float areaTriangulo(){
        float area;
        double b,h;
        b = solicitarDatos("la base"); //pide dato
        h = solicitarDatos("la altura"); //pide dato
        area = (float)(b*h/2); //calcula
        return area;
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