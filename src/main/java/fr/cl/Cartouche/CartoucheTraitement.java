package fr.cl.Cartouche;


public class CartoucheTraitement {
    public String debut() {
        String texte = "Debut de programme " + DateCartouche();
        return "Debut de programme";
    }

    public String fin() {
        return "Fin de programme" + DateCartouche();
    }

    public String DateCartouche() {
        DateMEF dateCartouche = new DateMEF();
        return dateCartouche.getDateHeureCouranteString();
    }

}