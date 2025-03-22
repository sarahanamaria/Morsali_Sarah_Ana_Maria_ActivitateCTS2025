package cts.adrian.prototype.tema;

public class Tema implements Prototype {
    private String denumire;
    private int nrExercitii;
    private boolean esteOptionala;

    public Tema(String denumire, int nrExercitii, boolean esteOptionala) {
        this.denumire = denumire;
        this.nrExercitii = nrExercitii;
        this.esteOptionala = esteOptionala;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;

    }

    public void setNrExercitii(int nrExercitii) {
        this.nrExercitii = nrExercitii;
    }

    @Override
    public Prototype clone() {
        return new Tema(denumire, nrExercitii, esteOptionala);
    }

    public void afiseaza() {
        System.out.println("Tema: " + denumire + ", exercitii: " + nrExercitii + ", este optionala: " + esteOptionala);
    }
}
