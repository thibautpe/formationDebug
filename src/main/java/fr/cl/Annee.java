package fr.cl;

public class Annee {
    private int id;
    private boolean isBissextile;

    public Annee(int id) throws Exception {
        if (id < 0) {
            throw (new Exception("L'année ne peut être négative !"));
        }
        this.setId(id);
        this.setBissextile();

    }


    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public boolean isBissextile() {
        return isBissextile;
    }

    private void setBissextile() {

        isBissextile = ((this.id % 100 != 0) && (this.id % 4 == 0));
    }
}
