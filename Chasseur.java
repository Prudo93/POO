public class Chasseur {
    String cible;
    String arme;
    int NbrDeVie;
public Chasseur(String cible, String arme, int NbrDeVie) {
    this.cible = cible;
    this.arme = arme;
    this.NbrDeVie = NbrDeVie;
    }
public void afficherNbreVie() {
    System.out.println("votre niveau de vie est : " + NbrDeVie );
    }
}
