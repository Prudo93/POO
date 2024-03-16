package ResponsabilitéUnique;

public class Cible {
        String cible;
        String arme;
        int NbrDeVie;
    public Cible(String cible, String arme, int NbrDeVie) {
        this.cible = cible;
        this.arme = arme;
        this.NbrDeVie = NbrDeVie;
        }
    public void afficherNbreVie() {
        System.out.println("votre niveau de vie est : " + NbrDeVie );
        }
        public class Cible {
            String cible;
            String arme;
            int NbrDeVie;
        public Cible(String cible, String arme, int NbrDeVie) {
            this.cible = cible;
            this.arme = arme;
            this.NbrDeVie = NbrDeVie;
            }
        public void EtatCible() {
            System.out.println("Votre cible " + cible + " est ateint, mission accomplit");
            }
    }
    
    
    }
