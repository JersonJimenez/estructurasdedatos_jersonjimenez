/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.estructuraobjeto;

/**
 *
 * @author JersonJr
 */
public class Matriz {
    
    //--Crear vector
    //--Parametro: Tamaño del vector a crear
    
    public boolean createVector(int sizeX, int sizeY)
    {
        String[][] vector = new String[sizeX][sizeY];        
        return true;
    }
    
    
    //--Buscar datos en el vector
    //--Retorna entero de la posición del vector
    //--Parametros: Vector, Cadena a buscar
    
    public int searchData(String[][] vector, String dato)
    {
        int position = 0;
        
        for(int i = 0; i <= vector.length; i++)
        {
            for(int j = 0; j < vector[i].length; i++)
            {
                if(vector[j] == null ? dato == null : vector[j].equals(dato))
                {
                    position = j;
                }
            }
            
        }
        
        return position;
    }    
    
    
    //--Imprime el vector en consola
    //--Parametro: Vector
    
    public void printVector(String[] vector)
    {
        for(int i = 0; i <= vector.length; i++)
        {
            System.out.printf(vector[i] + " \n");
        }
    }
    
    //--Insertar dato en el vector
    //--Parametro: Vector, Cadena con dato a ingresar, posicion en la cual se insertara la cadena
    
    public boolean insertVector(String[] vector, String dato, int position)
    {
        if(position <= vector.length)
        {
            for(int i = 0; i <= vector.length; i++)
            {
                if(vector[i] == Integer.toString(position))
                {
                    vector[i] = dato;
                }
            }                
            return true;
            
        }else{
            return false;
        }
    }
    
    //--Eliminar dato del vector
    //--Parametros: Vector, cadena con dato a eliminar
    //--Retorna boleano
    
    public boolean deleteData(String[] vector, String dato)
    {   
        boolean complete = false;
        
        for(int i = 0; i <= vector.length; i++)
        {
            if(vector[i] == dato)
            {
                vector[i] = null;
                complete = true;
            }
        }
        
        return complete;
    }
    
    
    //--Eliminar dato del vector
    //--Parametros: Vector, posición del vector a eliminar
    
    public boolean deleteDataInt(String[] vector, int position)
    {   
        if(position <= vector.length)
        {
            vector[position] = null;
            return true;
        }
        else
        {
            return false;
        }
    
    }
          
    //--Eliminar todo el vector
    //--Parametros: Vector
    
    public boolean deleteAll(String[] vector)
    {   
        vector = null;
        return true;
    }
    
}
