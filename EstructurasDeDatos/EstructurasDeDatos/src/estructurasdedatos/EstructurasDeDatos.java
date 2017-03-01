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
        
        System.out.println("----Clase Persona-----");
        
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
        
        System.out.println("----Clase Vehiculo-----");
        
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
        
        Vector vec = new Vector();
        
        System.out.print((boolean) vec.createVector(20));
        
    }
    


}
