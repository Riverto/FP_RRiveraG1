/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema14;

/**
 *
 * @author Riverto
 */
public class PP2Problema14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] vector = new int[7][7];
        vector = llenarVector(vector);
        mostrarVector(vector);
    }
    public static int [][] llenarVector(int[][] vec){
        for(int i=0;i<vec.length;i++){
            for(int j=0;j<vec.length;j++){
                if(i==j){
                    vec[i][j]=1;//inserta 1s cuando los valores i y j son iguales de forma que crea una linea diagonal por el centro
                } else {
                    vec[i][j]=0;//rellena los espacios faltantes con 0s
                }
            }
        }
        return vec;
    }
    public static void mostrarVector(int[][] vec){
        for(int i=0;i<vec.length;i++){
            for(int j=0;j<vec.length;j++){
                System.out.print(vec[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
