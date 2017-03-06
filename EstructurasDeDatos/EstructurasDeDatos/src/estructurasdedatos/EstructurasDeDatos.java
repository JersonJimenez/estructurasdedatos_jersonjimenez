/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

import estructurasdedatos.estructuraobjeto.Persona;
import estructurasdedatos.estructuraobjeto.Vehiculo;
import estructurasdedatos.array.Vector;
import estructurasdedatos.array.Matriz;
import estructurasdedatos.array.TransponerMatriz;
import estructurasdedatos.array.MultiplicarMatriz;

/**
 *
 * @author utp
 */

public class EstructurasDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //--Clase Persona
        
        System.out.println("----Clase Persona----- \n");
        
        Persona estudiante = new Persona();

        //--Ingresar valores
        estudiante.setEdad(20);
        estudiante.setNombre("Jerson Jimenez");
        estudiante.setEstatura((float) 1.70);
        estudiante.setNacionalidad("Colombiano");
        estudiante.setSexo("Masculino");
        estudiante.setSoltero(true);

        //--Mostrar información
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Estatura: " + estudiante.getEstatura());
        System.out.println("Nacionalidad: " + estudiante.getNacionalidad());
        System.out.println("Sexo: " + estudiante.getSexo());
        
      
        System.out.println("Soltero: " + estudiante.isSoltero());
        
        
        
        //--Clase Vehiculo
        
        System.out.println("----Clase Vehiculo----- \n");
        
        Vehiculo automovil = new Vehiculo();
        
        //--Ingresar valores
        automovil.setColor("Rojo");
        automovil.setModelo("2001");
        automovil.setNumeroSoat("98203871623874");
        automovil.setPlaca("ASG123");
        
        //--Mostras información
        
        System.out.println("Color vehículo: " + automovil.getColor());
        System.out.println("Modelo vehículo: " + automovil.getModelo());
        System.out.println("Número de Soat: " + automovil.getNumeroSoat());
        System.out.println("Placa: : " + automovil.getPlaca());
        
        
        //--Clase vector 
        
        System.out.println("----Clase Vector----- \n");
        Vector vec = new Vector();
        
        
        //--Crear vector con un tamaño definido
        
        if(vec.createVector(10)){
            System.out.print("Vector creado correctamente \n");
        }else{
            System.out.print("No se pudo crear el vector, el vector ya existe \n");
        }
        
        //--Insertar un dato en el vector
        
        if(vec.insertVector("Colombia", 5))
        {
            vec.insertVector("Argentina", 1);
            vec.insertVector("Brasil", 4);
            vec.insertVector("Uruguay", 8);
            vec.insertVector("Chile", 9);
            vec.insertVector("Panamá", 2);
            vec.insertVector("México", 6);
            
            System.out.print("Registro insertado correctamente \n");
        }else{
            System.out.print("No se pudieron insertar datos \n");
        }
        
        //--Buscar dato en el vector
        System.out.print("Registro encontrado en la posición: "+ (int) vec.searchData("Colombia")+ "\n");
        
        
        //--Mostrar todo el vector        
        vec.printVector();
        
        //--Eliminar vector
        
        if(vec.deleteAll()){
            System.out.print("Vector eliminado correctamente \n");
        }
        
        
        //--Clase Matriz 
        
        System.out.println("----Clase Matriz----- \n");
        Matriz matriz = new Matriz();
        
        
        //--Crear matriz con un tamaño definido
        
        int[][] matrizA = matriz.createMatriz(2, 2);
        
        //--Insertar datos en la matriz
        
        matrizA = matriz.insertMatriz(matrizA);        

        
        //--Buscar dato en el vector
        System.out.print("Registro encontrado en la posición: "+ (int[][]) matriz.searchData(2, matrizA) + "\n");
        
        
        //--Mostrar toda la matriz        
        matriz.printMatriz(matrizA);
        
        //--Eliminar matriz
        
        if(matriz.deleteAll(matrizA)){
            System.out.print("Matriz eliminada correctamente \n");
        }
        
        
        //--Transponer matriz
        
        System.out.println("----Clase Transponer-----");
        TransponerMatriz transponer = new TransponerMatriz();
        int[][] matrizB = matriz.createMatriz(2, 2);
        transponer.transponer(matrizA, matrizB);
        
        
        //--Multiplicar matriz
        System.out.println("----Clase Multiplicar-----");
        System.out.println("----Llene las listas a multiplicar-----");
        
        MultiplicarMatriz multiplicar = new MultiplicarMatriz();
        
        int[][] matrizC = matriz.createMatriz(2, 2);
        int[][] matrizD = matriz.createMatriz(2, 2);
    int[][] matrizE = matriz.createMatriz(2, 2);
        
        matrizC = matriz.insertMatriz(matrizC);
        matrizC = matriz.insertMatriz(matrizD);        
        
        multiplicar.multiplicar(matrizC, matrizD, matrizE);
        
        
        
        
    }
    


}
