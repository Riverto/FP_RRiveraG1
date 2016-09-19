package fp_rriverag1_a06;
import java.util.*;
public class FP_RRiveraG1_A06 {
    public static void main(String[] args) {
        int a,b;
        String o,r;
        a = solicitarDato("a"); //pedir los datos
        b = solicitarDato("b");
        o = solicitarOperacion(); //pedir el tipo de operacion
        r = resultados(o,a,b); //hacer las operaciones
        mostrarResultados(r); //mostrar el resultado
    }    
    public static int solicitarDato(String nombre){
        int dato;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de "+ nombre + " : ");
        try{
            dato = teclado.nextInt();}
        catch(InputMismatchException exception){ // atrapar errores
            System.out.println("El valor debe ser un numero entero");
            dato= solicitarDato(nombre); //metodos infinitos FTW
            return dato;
        }
        if ("b".equals(nombre)){
            dato = mayorqueCero(dato);
            return dato;} //pedir hasta tener un dato mayor a 0
        return dato;
    }    
    public static String solicitarOperacion(){
        String tipo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba la inicial de la operacion que desea hacer.('S'uma, 'R'esta, 'D'ivision, 'M'ultiplicacion, 'T'odas las anteriores): ");
        tipo = teclado.nextLine(); //pedir tipo de operacion
        while(!tipo.equals("D") && !tipo.equals("R") && !tipo.equals("T") && !tipo.equals("S") && !tipo.equals("M")){ //revisar que sea valido la respuesta
            System.out.println("Valor incorrecto");
            System.out.println("Escriba la inicial de la operacion que desea hacer.('S'uma, 'R'esta, 'D'ivision, 'M'ultiplicacion, 'T'odas las anteriores): ");
            tipo = teclado.nextLine();
        }
        return tipo;
    }
    public static String resultados(String operacion, int dato1, int dato2){
        String resultado;
        switch(operacion){  //preparar el resultado que sera mostrado
            case "S": return resultado="El resultado de "+dato1+"+"+dato2+" es: "+((double)dato1+dato2);
            case "R": return resultado = "El resultado de "+dato1+"-"+dato2+" es: "+((double)dato1-dato2);
            case "D": return resultado = "El resultado de "+dato1+"/"+dato2+" es: "+((double)dato1/dato2);
            case "M": return resultado = "El resultado de "+dato1+"*"+dato2+ " es: "+((double)dato1*dato2);
            case "T": return resultado = "El resultado de "+dato1+"+"+dato2+" es: "+((double)dato1+dato2)+"\n"
                    +"El resultado de "+dato1+"-"+dato2+" es: "+((double)dato1-dato2)+"\n"
                    + "El resultado de "+dato1+"/"+dato2+" es: "+((double)dato1/dato2)+"\n"
                    +"El resultado de "+dato1+"*"+dato2+ " es: "+((double)dato1*dato2);
            default: return resultado=("Como llegaste aqui?");
        }
    }
    public static void mostrarResultados(String mensaje){
        System.out.println(mensaje); //mostrar resultado
    }        
    public static int mayorqueCero(int numero){ //se repite hasta tener un valor valido
        Scanner teclado= new Scanner(System.in);
        while(numero<=0){
            System.out.println("Valor incorrecto, ingrese un numero mayor a 0");
            numero = solicitarDato("b");
            }
        return numero;
    }    
}