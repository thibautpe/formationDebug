package fr.cl;

import java.util.ArrayList;
import java.util.List;

/**
 * cf https://www.vogella.com/tutorials/JavaCollections/article.html
 * * @Author
 */
class Calendrier {

    private int anneeInput;
    private List<Annee> listeAnnees = new ArrayList<>();

    public Calendrier(int anneeInput) {
        this.anneeInput = anneeInput;
    }

    public Calendrier() {
        this.anneeInput = 1900;
    }

    public int getAnneeInput() {
        return anneeInput;
    }

    public void setAnneeInput(int anneeInput) {
        this.anneeInput = anneeInput;
    }

    public void setListeAnnees() throws Exception {
        for (int i = 1; i <= anneeInput; i++) {
            Annee anneeTemp = new Annee(i);
            this.listeAnnees.add(anneeTemp);
        }
    }

    public void editListeAnnees() {
        listeAnnees.forEach(Annee -> System.out.println(Annee.getId()));


    }
}
