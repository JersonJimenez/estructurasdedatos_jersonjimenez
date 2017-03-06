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
public class MultiplicarMatriz {
             
    public void multiplicar(int[][] matrizA, int[][] matrizB, int[][] matrizC)
    {    
        int valor = 0;
        
        for(int i= 0; i < matrizA.length ; i++)
        {                        
            for(int j=0; j < matrizB[i].length ; j++)
            {
                for(int k=0; k < matrizB.length ; k++)
                {                    
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }    
        }
        
        
        for(int i=0; i< matrizC.length; i++)
        {
            for(int j=0; j< matrizC[i].length; j++)
            {
                System.out.print(matrizC[i][j] + " ");
            }
            
            System.out.println();
        }
        

    }
}
