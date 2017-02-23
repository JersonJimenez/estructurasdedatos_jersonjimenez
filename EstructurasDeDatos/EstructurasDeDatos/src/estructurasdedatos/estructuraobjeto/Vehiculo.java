/*
  * Fecha: 23/02/2017
  * Descripción: Clase vehiculo
  *              Esta clase me permite instanciar un objeto de tipo vehiculo con el cual puedo cambiar y
                    consultar los valores de sus variables

 */
package estructurasdedatos.estructuraobjeto;

/**
 *
 * @author Jerson Jimenez 
 */

public class Vehiculo {
    
    private String placa;
    private String modelo;
    private String numeroSoat;
    private String color;

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the numeroSoat
     */
    public String getNumeroSoat() {
        return numeroSoat;
    }

    /**
     * @param numeroSoat the numeroSoat to set
     */
    public void setNumeroSoat(String numeroSoat) {
        this.numeroSoat = numeroSoat;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
