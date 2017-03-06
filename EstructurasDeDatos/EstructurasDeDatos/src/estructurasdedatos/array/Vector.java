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

public class Vector 
{   
    int size = 20;
    String[] vector = new String[size];
    
    
    //--Crear vector
    //--Parametro: Tamaño del vector a crear
    
    public boolean createVector(int size)
    {
        boolean complete = false;
        
        if(this.vector == null)
        {
            this.vector = new String[size];  
            complete = true;
        }else
        {
            this.vector = new String[size];  
            this.size = size;
            complete = false;
        }
     
        return complete;
    }
    
    
    //--Buscar datos en el vector
    //--Retorna entero de la posición del vector
    //--Parametros: Cadena a buscar
    
    public int searchData(String dato)
    {
        int position = 0;
        
        for(int i = 0; i < this.size; i++)
        {
            if(this.vector[i] == null ? dato == null : this.vector[i].equals(dato))
            {
                position = i;
            }
        }
        
        return position;
    }    
    
    
    //--Imprime el vector en consola    
    
    public void printVector()
    {
        for(int i = 0; i < this.size; i++)
        {
            System.out.printf(vector[i] + " \n");
        }
    }
    
    //--Insertar dato en el vector
    //--Parametro: Cadena con dato a ingresar, posicion en la cual se insertara la cadena
    
    public boolean insertVector(String dato, int position)
    {
        boolean complete = false;
        
        if(position > 0 && position < this.size)
        {
            {
                this.vector[position] = dato;                   
                complete = true;
            }                
        }
        
        return complete;
    }
    
    //--Eliminar dato del vector
    //--Parametros: cadena con dato a eliminar
    //--Retorna boleano
    
    public boolean deleteData(String dato)
    {   
        boolean complete = false;
        
        for(int i = 0; i < this.size; i++)
        {
            if(vector[i] == null ? dato == null : vector[i].equals(dato))
            {
                vector[i] = null;
                complete = true;
            }
        }
        
        return complete;
    }
    
    
    //--Eliminar dato del vector
    //--Parametros: Vector, posición del vector a eliminar
    
    public boolean deleteDataInt(int position)
    {   
        if(position > 0 && position <= this.size)
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
    //--Parametros: 
    
    public boolean deleteAll()
    {   
        if(this.vector != null)
        {
            this.vector = null;
            return true;
        }else
        {
            return false;
        }
    }
    
}
