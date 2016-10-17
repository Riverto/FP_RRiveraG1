/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema15;

import java.util.Random;

/**
 *
 * @author Riverto
 */
public class PP2Problema15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] vector = new int[11][11];
        llenarVector(vector);
        mostrarVector(vector);
    }
    public static int [][] llenarVector(int[][] vec){
        Random ran = new Random();
        for(int i=0;i<vec.length;i++){
            for(int j=0;j<vec.length;j++){
                if(j==10){
                    int s=0;
                    for(j=0;j<vec.length-1;j++){
                        s = vec[i][j]+s;
                    }
                    vec[i][j]=s;
                } else vec[i][j]=ran.nextInt(100+1);
                if(i==10){
                    int s=0;
                    for(i=0;i<vec.length-1;i++){
                        s = vec[i][j]+s;
                    }
                    vec[i][j]=s;
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
