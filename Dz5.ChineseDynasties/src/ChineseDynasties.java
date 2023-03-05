public class ChineseDynasties {
    public static void main(String[] args) {
        int liWar = 13*860;
        int liArcher = 24*860;
        int liRider = 46*860;
        int liAttack = liWar+liArcher+liRider;
        double minWar = 9*860*1.5;
        double minArcher = 35*860*1.5;
        double minRider = 12*860*1.5;
        double minAttack = minWar+minArcher+minRider;
        System.out.println("Power Li: " + liAttack + ", Power Min: " + minAttack);
    }
}
