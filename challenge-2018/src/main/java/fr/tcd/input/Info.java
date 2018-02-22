package fr.tcd.input;

import java.util.List;

public class Info {

    public final String nom;

    public final List<Integer> valeurs;

    public Info(final String nom, final List<Integer> valeurs) {
        this.nom = nom;
        this.valeurs = valeurs;
    }

    @Override
    public String toString() {
        return "Info{" +
                "nom='" + nom + '\'' +
                ", valeurs=" + valeurs +
                '}';
    }
}
