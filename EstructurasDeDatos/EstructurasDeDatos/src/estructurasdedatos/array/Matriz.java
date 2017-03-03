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
public class Matriz 
{
    
    //--Crear matriz con sus respectivas medidas
    
    private int sizeX = 10;
    private int sizeY = 5;
    
    String[][] matriz = new String[sizeX][sizeY];     
    
    

    //--Crear matriz
    //--Parametro: Tamaño de la matriz a crear
    
    public boolean createMatriz(int sizeX, int sizeY)
    {
        this.matriz = new String[sizeX][sizeY];        
        return true;
    }
    
    
    //--Buscar datos en la matriz
    //--Retorna entero de la posición de la matriz
    //--Parametros:Cadena a buscar
    
    public int[][] searchData(String dato)
    {
        int[][] position = null;
        
        for(int i = 0; i <= this.sizeX; i++)
        {
            for(int j = 0; j < this.sizeY; i++)
            {
                if(this.matriz[i][j] == null ? dato == null : this.matriz[i][j].equals(dato))
                {
                    position = new int [i][j];
                }
            }
            
        }
        
        return position;
    }    
    
    
    
    //--Imprime el vector en consola
    //--Parametro:
    
    public void printVector()
    {
        for(int i = 0; i <= this.sizeX; i++)
        {
            for(int j = 0; j <= this.sizeY; i++)
            {
                System.out.printf(this.matriz[i][j] + " \n");
            }            
        }
    }
    
    //--Insertar dato en el vector
    //--Parametro: Vector, Cadena con dato a ingresar, posicion en la cual se insertara la cadena
    
    public boolean insertVector(String dato, int positionX, int positionY)
    {   
        boolean complete = false;
        
        if(positionX >= 0 && positionX < sizeX)
        {
            if(positionY >= 0 && positionY < sizeY)
            {
                matriz[positionX][positionY] = dato;
                complete = true;
            }
        }
        
        return complete;
    }
    
    //--Eliminar dato del vector
    //--Parametros: Vector, cadena con dato a eliminar
    //--Retorna boleano
    
    public boolean deleteData(String[] vector, String dato)
    {   
        boolean complete = false;
        
        for(int i = 0; i <= this.sizeX; i++)
        {
            for(int j = 0; j<= this.sizeY; j++)
            {
                if(matriz[i][j] == null ? dato == null : matriz[i][j].equals(dato))
                {
                    matriz[i][j] = null;
                    complete = true;
                }
            }
        }
        
        return complete;
    }
    
    
    //--Eliminar dato del vector
    //--Parametros: Posición del vector a eliminar
    
    public boolean deleteDataInt(int positionX, int positionY)
    {   
        boolean complete = false;
        
        if(positionX >= 0 && positionX < sizeX)
        {
            if(positionY >= 0 && positionY < sizeY)
            {
                matriz[positionX][positionY] = null;
                complete = true;
            }            
        }

        return complete;
    }
          
    //--Eliminar todo el vector
    //--Parametros: Vector
    
    public boolean deleteAll()
    {   
        if(this.matriz != null)
        {
            this.matriz = null;
            return true;
        }else
        {
            return false;
        }
        
    }
    
}
