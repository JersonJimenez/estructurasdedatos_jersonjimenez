/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.array;

/**
 *
 * @author JersonJr
 */
public class TransponerMatriz {
        
            
    public void transponer(int[][] matrizA, int[][] matrizB)
    {
        this.printMatriz(matrizA);
        System.out.print("Matriz B \n");
        for(int i=0; i< matrizA.length ; i++)
        {
            for(int j=0; j< matrizA[i].length; j++)
            {
                matrizB[i][j] = matrizA[i][j];
                System.out.print(matrizB[i][j] + "\n");
            }
        }
    }
    
    
    public void printMatriz(int[][] matrizA)
    {
        System.out.print("Matriz A \n");
        
        for(int i = 0; i < matrizA.length; i++)
        {
            for(int j = 0; j < matrizA[i].length; j++)
            {
                System.out.print(matrizA[i][j] + "\n");                                                
            }            
        }
    }
}
