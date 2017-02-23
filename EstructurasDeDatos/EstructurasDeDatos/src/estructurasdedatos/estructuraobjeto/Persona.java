/*
 * Fecha: 22/02/2017
 * Descripción: Clase persona, primera estructura de datos
 *              Esta clase me permite instanciar un objeto de tipo persona
*/

//--Definiendo el paquete donde esta la clase
package estructurasdedatos.estructuraobjeto;

/*
 * Autor: Jerson Jimenez Rugeles
*/

//--Firma de la clase
public class Persona {
    
    private String cedula;
    private String nombre;
    private float estatura;
    private int edad;
    private String sexo;
    private String nacionalidad;
    private boolean soltero;

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the estatura
     */
    public float getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


    /**
     * @return the soltero
     */
    public boolean isSoltero() {
        return soltero;
    }

    /**
     * @param soltero the soltero to set
     */
    public void setSoltero(boolean soltero) {
        this.soltero = soltero;
    }

    
    
    
}
