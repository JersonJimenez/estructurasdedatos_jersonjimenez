/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

import estructurasdedatos.estructuraobjeto.Persona;

/**
 *
 * @author utp
 */
public class EstructurasDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

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
    }

}
