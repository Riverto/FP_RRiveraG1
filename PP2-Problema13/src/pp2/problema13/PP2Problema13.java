/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema13;
import java.util.*;

/**
 *
 * @author Riverto
 */
public class PP2Problema13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []vector = new int[30];
        int p,sp;
        vector=llenarvector(vector);
        p=promedioVector(vector);
        sobrePromedio(vector,p);
        cont();
    }
    public static int[] llenarvector(int[] v){
        Scanner entrada = new Scanner(System.in);
        for(int i=0;i<v.length;i++){
            System.out.print("Introduce un numero para la posicion ["+ (i+1) +"] :");
           v[i]=entrada.nextInt();
//            Random ran = new Random();    //autofill
//            v[i]=ran.nextInt(100+1);           //autofill
        }
    return v;}
    public static int promedioVector(int[] v){
        int a=0,p=0;
        for (int i=0; i<v.length; i++){
            a=v[i]+a;
            p++;
        }
        System.out.println("El promedio de los numeros en el arreglo es: "+(a/p));
        return (a/p);
    }
    public static void sobrePromedio(int[] v,int media){
        int ovr=0;
        for(int i=0;i<v.length;i++){
            if(v[i]>media){
                ovr++;
            }
        }
        System.out.println("La cantidad de numeros sobre el promedio es: "+ovr);
        System.out.println("La cantidad de numeros debajo del promedio es: "+(v.length-ovr));
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
