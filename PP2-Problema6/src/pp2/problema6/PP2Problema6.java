/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema6;
import java.util.Scanner;

/**
 *
 * @author Riverto
 */
public class PP2Problema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double horas,salario;
        salario = pedirNumero("pago por hora");
        horas = pedirNumero("numero de horas");
        System.out.println("El pago por "+horas+" a "+salario+" por hora es "+calcularPago(horas, salario));
    }
    public static double pedirNumero(String tipo){
    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingrese el "+tipo+" : ");
    double num=entrada.nextDouble();
    return num;
    }
    public static double calcularPago(double h,double s){
        double pago;
        pago=0;
        if(h<=40) pago=h*s;
        if(h>=48) pago=((40*s)+(h-40)*(2*s));
        if(h>48) pago=((40*s)+8*(2*s)+(h-48)*(3*s));
        return pago;
    }
}
