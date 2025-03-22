package cts.sarah.prototype.tema;
// Un student primeste teme din diverse materii. Profesorul creeaza o tema de baza si apoi face copii pentru alti studenti, schimband doar numele si numarul de exercitii. Trebuie sa poti clona tema si sa o personalizezi fara sa o afectezi pe cea originala.
public class Main {
    public static void main (String[] args){
        Tema temaBaza = new Tema("Tema POO", 5, false);
        temaBaza.afiseaza();

        // Copie 1
        Tema tema1 = (Tema) temaBaza.clone();
        tema1.setDenumire("Tema POO - Andrei");
        tema1.setNrExercitii(7);
        tema1.afiseaza();

        // Copie 2
        Tema tema2 = (Tema) temaBaza.clone();
        tema2.setDenumire("Tema POO - Maria");
        tema2.setNrExercitii(4);
        tema2.afiseaza();
    }

}
