/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema11;
import java.util.Scanner;

/**
 *
 * @author Riverto
 */
public class PP2Problema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        num=pedirNumero();
        intTOrom(num);
        cont();
    }
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el numero (mayor a 0 y menor que 4000) que quiere traducir a romano: ");
        int num=entrada.nextInt();
        while(num<=0||num>=4000){
            num = pedirNumero();
        }
        return num;
    }
    public static void intTOrom(int n){
        int v,p=0;
        String rom="";
        String []array = new String[4];
        for(int i=10;i<=n*10;i=i*10){ //pasa por 10,100,1000...
            v = ((n%i)/(i/10))*(i/10); //toma el componente de el numero con base a i, si n es 1478 y i es 1000, v es 400
            if(v==0) rom="";
            if(v>0&&v<10)rom=unidades(v);
            if(v>9&&v<100) rom=decenas(v);
            if(v>99&&v<1000) rom=centenas(v);
            if(v>999&&v<10000) rom=milares(v);
            array[p]=rom;//agrega la letra a un arreglo
            p++;
        }
        System.out.print("El numero "+n+" es ");
        for(int i=(array.length-1);i>=0;i--){//muestra el arreglo en reversa sin tener que voltear los datos
            if (array[i]==null){System.out.print("");
                    } else{
                System.out.print(array[i]);
            }
        }
        System.out.print(" en romano \n");
    }
    public static String unidades(int var){
        String roman="";
        switch(var){
            case(1):
                roman="I";
                return roman;
            case(2):
                roman="II";
                return roman;
            case(3):
                roman="III";
                return roman;
            case(4):
                roman="IV";
                return roman;
            case(5):
                roman="V";
                return roman;
            case(6):
                roman="VI";
                return roman;
            case(7):
                roman="VII";
                return roman;
            case(8):
                roman="VII";
                return roman;
            case(9):
                roman="IX";
                return roman;
            default:
                System.out.println("Error");
        }
        return roman;
    }
    public static String decenas(int var){
        String roman="";
            switch(var){
                case(10):
                    roman="X";
                    return roman;
                case(20):
                    roman="XX";
                    return roman;
                case(30):
                    roman="XXX";
                    return roman;
                case(40):
                    roman="XL";
                    return roman;
                case(50):
                    roman="L";
                    return roman;
                case(60):
                    roman="LX";
                    return roman;
                case(70):
                    roman="LXX";
                    return roman;
                case(80):
                    roman="LXXX";
                    return roman;
                case(90):
                    roman="XC";
                    return roman;
                default:
                    System.out.println("Error");
            }
        return roman;
    }
    public static String centenas(int var){
        String roman="";
        switch(var){
            case(100):
                roman="C";
                return roman;
            case(200):
                roman="CC";
                return roman;
            case(300):
                roman="CCC";
                return roman;
            case(400):
                roman="CD";
                return roman;
            case(500):
                roman="D";
                return roman;
            case(600):
                roman="DC";
                return roman;
            case(700):
                roman="DCC";
                return roman;
            case(800):
                roman="DCCC";
                return roman;
            case(900):
                roman="CM";
                return roman;
            default:
                System.out.println("Error");
        }
        return roman;
    }
    public static String milares(int var){
        String roman="";
        switch(var){
            case(1000):
                roman="M";
                return roman;
            case(2000):
                roman="MM";
                return roman;
            case(3000):
                roman="MMM";
                return roman;
            default:
                System.out.println("Error");
        }
        return roman;
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