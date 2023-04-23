import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean order = true;

        while (order) {
            Drinks drinks = new Drinks();
            Scanner scan = new Scanner(System.in);

            System.out.println("Выберите напиток: ");
            System.out.println("1. " + DrinksMachine.COFFEE.getName());
            System.out.println("2. " + DrinksMachine.TEA.getName());
            System.out.println("3. " + DrinksMachine.LEMONADE.getName());
            System.out.println("4. " + DrinksMachine.MINERAL.getName());
            System.out.println("5. " + DrinksMachine.COCA_COLA.getName());
            System.out.println("6. " + DrinksMachine.MOJITO.getName());
            System.out.println("7. Выход");


            int choice = scan.nextInt();


            switch (choice) {
                case 1 -> drinks.makeCoffe();
                case 2 -> drinks.makeTea();
                case 3 -> drinks.makeLemonade();
                case 4 -> drinks.makeMineral();
                case 5 -> drinks.makeCocaCola();
                case 6 -> drinks.makeMojito();
                case 7 -> {
                    order = false;
                    drinks.endPraper();
                }
                default -> System.out.println("Такого напитка нет!");
            }
        }
    }
}