public class ChineseDynasties {
    public static void main(String[] args) {
        int quantityUnit = 860;
        double multiplier = 1.5;
        int liWar = 13*quantityUnit;
        int liArcher = 24*quantityUnit;
        int liRider = 46*quantityUnit;
        int liAttack = liWar+liArcher+liRider;
        double minWar = 9*quantityUnit*multiplier;
        double minArcher = 35*quantityUnit*multiplier;
        double minRider = 12*quantityUnit*multiplier;
        double minAttack = minWar+minArcher+minRider;
        if (liAttack > minAttack) {
            System.out.println("Lee Win");
        } else {
            System.out.println("Min Win");
        }
        System.out.println("Power Li: " + liAttack + ", Power Min: " + minAttack);
    }
}
