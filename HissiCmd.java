package hissi;

import fi.jyu.mit.ohj2.*;

/**
 * Komentoriviltä käytettävä hissisimulaatio
 * Pääohjelma
 * 20.10.2018
 * Petra Puumala
 */
public class HissiCmd {

    /**
     * Pääohjelma, joka tulostaa alussa ohjeistusta, sitten kysyy syötettä käyttäjältä ja välittää käskyjä hissijarj-oliolle riippuen käyttäjän syötteestä.
     * @param args käsky
     */
    public static void main(String[] args) {
        Hissijarjestelma hissijarj = new Hissijarjestelma();
        System.out.println(
                "Hissimatkustelua.\nVoit kirjoittaa kerroksen mihin haluat tai riko,\njos haluat kokeilla mitä sitten tapahtuu\nmatkustelun voit lopettaa painamalla enteriä");
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
                System.out.println("Tuo ei ole kelvollinen käsky");
                break;
            }
        }
    }
}