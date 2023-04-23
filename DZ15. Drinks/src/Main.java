import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Drinks drinks = new Drinks();

        boolean order = true;

        while (order) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Выберите напиток: ");
            System.out.println("1. " + DrinksMachine.COFFEE.getName() + " enter coffee");
            System.out.println("2. " + DrinksMachine.TEA.getName() + " enter tea");
            System.out.println("3. " + DrinksMachine.LEMONADE.getName() + " enter lemonade");
            System.out.println("4. " + DrinksMachine.MINERAL.getName() + " enter mineral");
            System.out.println("5. " + DrinksMachine.COCACOLA.getName() + " enter cocacola");
            System.out.println("6. " + DrinksMachine.MOJITO.getName() + " enter mojito");
            System.out.println("7. " + DrinksMachine.EXIT.getName() + " enter exit");
            String choice = scan.next();
            String choiceToUpper = choice.toUpperCase();
            DrinksMachine choiceEnum = DrinksMachine.valueOf(choiceToUpper);

            switch (choiceEnum) {
                case COFFEE -> drinks.makeCoffe();
                case TEA -> drinks.makeTea();
                case LEMONADE -> drinks.makeLemonade();
                case MINERAL -> drinks.makeMineral();
                case COCACOLA -> drinks.makeCocaCola();
                case MOJITO -> drinks.makeMojito();
                case EXIT ->  {
                    order = false;
                    drinks.endPraper();
                }
                default -> System.out.println("Такого напитка нет!");
            }
        }
    }
}