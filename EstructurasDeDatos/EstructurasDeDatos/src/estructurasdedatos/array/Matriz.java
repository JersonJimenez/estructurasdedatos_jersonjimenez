/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.array;
import java.util.Scanner;

/**
 *
 * @author JersonJr
 */

public class Matriz 
{
    
    //--Clase para leer variables    
    Scanner scan = new Scanner(System.in);                
    
          
    //--Crear matriz
    //--Parametro: Tamaño de la matriz a crear
    //--Retorna la matriz creada
    
    public int[][] createMatriz(int sizeX, int sizeY)
    {
        int[][] matriz = new int[sizeX][sizeY];                   
        return matriz;
    }
    
    
    //--Buscar datos en la matriz
    //--Retorna entero de la posición de la matriz
    //--Parametros:Cadena a buscar, matriz con datos
    
    public int[][] searchData(int dato, int[][] matriz)
    {
        int[][] position = null;
        
        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz[i].length; j++)
            {
                if(matriz[i][j] == dato)
                {
                    position = new int [i][j];
                }                                
            }
            
        }
        
        return position;
    }    
    
    
    
    //--Imprime la matriz en consola
    //--Parametro: matriz con datos
    
    public void printMatriz(int[][] matriz)
    {
        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz[i].length; j++)
            {
                System.out.printf(matriz[i][j] + " \n");
            }            
        }
    }
    
    
    //--Insertar dato en el vector
    //--Parametro: Matriz a llenar, Cadena con dato a ingresar, posicion en la cual se insertara la cadena
    //--Retorna: Matriz llena
    
    public int[][] insertMatriz(int[][] matriz)
    {      
        System.out.println("Inicie a insertar sus datos");
        
        for(int i=0; i < matriz.length; i++)
        {
            for(int j=0; j < matriz[i].length; j++)
            {
                System.out.print("Posición "+i+","+j+ ":");
                matriz[i][j] = scan.nextInt();
            }
        }
                                   
        return matriz;
    }
    
    //--Eliminar dato del vector
    //--Parametros: Vector, cadena con dato a eliminar
    //--Retorna boleano
    
    public boolean deleteData(int[][] matriz, int dato)
    {   
        boolean complete = false;
        
        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j< matriz[i].length; j++)
            {
                if(matriz[i][j] == dato)
                {
                    matriz[i][j] = 0;
                    complete = true;
                }
            }
        }
        
        return complete;
    }
    
    
    //--Eliminar dato del vector
    //--Parametros: Matriz a eliminar, Posiciones de la matriz a eliminar
    
    public boolean deleteDataInt(int positionX, int positionY, int[][] matriz)
    {   
        boolean complete = false;
        
        if(positionX >= 0 && positionX < matriz.length)
        {
            if(positionY >= 0 && positionY < matriz[positionY].length)
            {
                matriz[positionX][positionY] = 0;
                complete = true;
            }            
        }

        return complete;
    }
          
    //--Eliminar todo el vector
    //--Parametros: Matriz
    
    public boolean deleteAll(int[][] matriz)
    {   
        if(matriz != null)
        {
            matriz = null;
            return true;
        }else
        {
            return false;
        }
        
    }
    
}
