package pp2.problema2;
import java.util.Scanner;

/**
 *
 * @author Riverto
 */
public class PP2Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int metros;
        metros = askMeters(); //pide los metros
        convertMeters(metros); //convierte y muestra los resultados
    }
        public static int askMeters(){
        int m;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el numero de metros que quiere convertir: ");
        m = teclado.nextInt(); //recibe los metros
        return m;
        }
        public static void convertMeters(int m){
            System.out.println(m+" metros en pies es: "+(3.28084*m));
            System.out.println(m+" metros en yardas es: "+(1.0936*m));
            System.out.println(m+" metros en millas e: "+(0.00062*m));
            cont();
        }
    public static void cont(){
        int resp;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Desea continuar?"); //menu
        System.out.println("1. Si");
        System.out.println("0. No");        
        resp = entrada.nextInt();
        if (resp<0 || resp>1){ //comprobación de respuesta
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
    public static void mensajeSalida(){
        System.out.println("Gracias por usar el programa"); //despedida
        System.exit(0);
    }
}