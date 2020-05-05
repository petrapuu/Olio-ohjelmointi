/**
 * 
 */
package hissi;

/**
 * @author petra
 * @version 20.10.2018
 * Luokka joka kertoo hissin tilan
 */
public class Hissi {
    private String tila = "toiminnassa";

    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        // 

    }


    /**
     * metodi, jolla saadaan selville hissin tila
     * @return tieto hissin tilasta
     */
    public String getTila() {
        String hissinTila = this.tila;
        return hissinTila;
    }


    /**
     * Muutetaan hissin tilaa
     * @param hissinTila tilamuutos
     */
    public void setTila(String hissinTila) {
        this.tila = hissinTila;
    }

}
