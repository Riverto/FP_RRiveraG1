package fp_rriverag1_a7;
import java.util.*;

public class FP_RRiveraG1_A7 {

    public static void main(String[] args) {
        int[][]arr = tamañoArray();
        System.out.println("El tamaño del arreglo 1 es "+arr.length);
        System.out.println("El tamaño del arreglo 2 es "+arr[0].length);
        arr = llenarvector(arr);
        mostrartabla(arr);
    }
    public static int[][] tamañoArray(){
        int x,y;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el numero de valores en la columna vertical");
        y = entrada.nextInt();
        System.out.println("Introduce el numero de valores en la columna horizontal");
        x =  entrada.nextInt();
        int[][] a = new int[y][x];
    return a;
    }
    public static int[][] llenarvector(int[][] a){
        System.out.println("El tamaño del arreglo 1 es "+a.length);
        System.out.println("El tamaño del arreglo 2 es "+a[0].length);
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[0].length;j++){
                a[i][j]=j+1;
            }
        }
        return a;
    }
    public static void mostrartabla(int[][] a){
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[0].length;j++){
                System.out.print(i*j+"\t");
            } System.out.println("\n");
        }
    }
}