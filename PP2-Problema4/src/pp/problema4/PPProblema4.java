package pp.problema4;
import java.util.*;

/**
 *
 * @author Riverto
 */
public class PPProblema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int g;
        g = pedirNumero();
        CtoF(g);
    }
    public static int pedirNumero(){
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el numero de grados Celcius que quiere convertir: ");
        n = teclado.nextInt(); //recibe los metros
        return n;
        }    
    public static void CtoF(int g){
        System.out.println(g+"°C es: "+(g*1.8+32)+"°F");
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
