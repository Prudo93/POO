interface Cible {
    void chasse();
}

class Gibier implements Cible {
    public void chasse() {
        System.out.println("Chasse du gibier a commencé");
    }
}

class Aigle implements Cible {
    public void chasse() {
        System.out.println("Chasse du aigle a commencé");
    }
}

class chasseur {
    public void chasse(Cible animal) {
        animal.chasse();
    }
}
