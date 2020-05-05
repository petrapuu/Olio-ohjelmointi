package hissi;

import fi.jyu.mit.ohj2.*;

/**
 * Komentorivilt� k�ytett�v� hissisimulaatio
 * P��ohjelma
 * 20.10.2018
 * Petra Puumala
 */
public class HissiCmd {

    /**
     * P��ohjelma, joka tulostaa alussa ohjeistusta, sitten kysyy sy�tett� k�ytt�j�lt� ja v�litt�� k�skyj� hissijarj-oliolle riippuen k�ytt�j�n sy�tteest�.
     * @param args k�sky
     */
    public static void main(String[] args) {
        Hissijarjestelma hissijarj = new Hissijarjestelma();
        System.out.println(
                "Hissimatkustelua.\nVoit kirjoittaa kerroksen mihin haluat tai riko,\njos haluat kokeilla mit� sitten tapahtuu\nmatkustelun voit lopettaa painamalla enteri�");
        System.out.println("Mihin kerrokseen? Kerroksia on 3");

        while (true) {
            String rivi = Syotto.kysy("");
            if (rivi.length() == 0)
                break;
            StringBuilder kerros = new StringBuilder(rivi);

            switch (kerros.toString()) {
            case "1":
            case "2":
            case "3":
                hissijarj.meneKerrokseen(kerros);
                break;
            case "riko":
                hissijarj.hissiHajoaa();
                break;
            case "ilmoita viasta":
                hissijarj.korjaaHissi();
                break;
            default:
                System.out.println("Tuo ei ole kelvollinen k�sky");
                break;
            }
        }
    }
}