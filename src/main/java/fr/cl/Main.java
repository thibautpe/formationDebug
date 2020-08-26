package fr.cl;


import fr.cl.Cartouche.CartoucheTraitement;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        // Affichage du cartouche de début
        CartoucheTraitement cartoucheTraitement1 = new CartoucheTraitement();
        System.out.println(cartoucheTraitement1.debut());


        // Création du calendrier

        Calendrier calendrier = new Calendrier();
        // Récupère l'année passée en paramètre
        if (args.length != 0) {
            try {
                calendrier.setAnneeInput(Integer.parseInt(args[0]));
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }

            try {
                calendrier.setListeAnnees();
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
            calendrier.editListeAnnees();
            System.out.println(calendrier.getAnneeInput());

            // Affichage du cartouche de fin
            SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            CartoucheTraitement cartoucheTraitement2 = new CartoucheTraitement();
            System.out.println(cartoucheTraitement2.fin());
        }
    }
}
