/**
 * 
 */
package hissi;

/**
 * @author petra
 * @version 20.10.2018
 * Ohjauksesta vastaava hissij‰rjestelm‰. 
 */
public class Hissijarjestelma {
    private Hissi hissi = new Hissi();
    private Huolto huolto = new Huolto();
    private int kerrosNro = 1;
    private String tila = "toiminnassa";


    /**
     * Liikutetaan hissi haluttuun kerrokseen, ilmoitetaan hissin olevan jo halutussa kerroksessa. Jos hissi on rikki,
     * ilmoitetaan t‰st‰ k‰ytt‰j‰lle ja kysyt‰‰n halutaanko ilmoittaa viasta.
     * @param kerros mik‰ kerros
     */

    public void meneKerrokseen(StringBuilder kerros) {
        tila = hissi.getTila();
        if (tila == "toiminnassa") {
            switch (kerros.toString()) {
            case "1":
                if (kerrosNro == 1) System.out.println("Hissi on jo kerroksessa");
                else System.out.println("Pling! Kerroksessa 1!");
                kerrosNro = 1;
                break;
            case "2":
                if (kerrosNro == 2) System.out.println("Hissi on jo kerroksessa");
                else System.out.println("Pling! Kerroksessa 2!");
                kerrosNro = 2;
                break;
            case "3":
                if (kerrosNro == 3) System.out.println("Hissi on jo kerroksessa");
                else System.out.println("Pling! Kerroksessa 3!");
                kerrosNro = 3;
                break;
            default:
                break;
            }
        } else {
            System.out.println(
                    "Mit‰s menit rikkomaan. Jos haluat p‰‰st‰ viel‰ matkaamaan hissill‰, kirjoita \"ilmoita viasta\"");
        }

    }


    /**
     * Hissi hajoaa, p‰ivitet‰‰n hissin tilaksi rikki
     */
    public void hissiHajoaa() {
        hissi.setTila("rikki");
        System.out.println(
                "Autsista rikoit hissin! Kokeileppa nyt p‰‰st‰ johonkin kerrokseen...");
    }


    /**
     * ei k‰ytˆss‰
     */
    public static void main() {
        //
    }


    /**
     * Jos hissille tilattu korjaus, mutta se on toimivassa tilassa, ilmoitetaan ettei sit‰ tarvi korjata. Muutoin
     * tilataan hissin huolto ja t‰m‰n j‰lkeen p‰ivitet‰‰n hissin tilaksi toiminnassa.
     */
    public void korjaaHissi() {
        String hissinTila = hissi.getTila();
        if (hissinTila == "toiminnassa")
            System.out.println("Hissi ei tarvitse korjausta");
        else {
            huolto.huollaHissi();
            hissi.setTila("toiminnassa");
            tila = hissi.getTila();
        }
    }

}