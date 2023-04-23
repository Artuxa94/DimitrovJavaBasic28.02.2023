public class Drinks {
    public static final int COFFEE_PRICE = 11;
    public static final int TEA_PRICE = 9;
    public static final int LEMONADE_PRICE = 12;
    public static final int MOJITO_PRICE = 15;
    public static final int MINERAL_PRICE = 5;
    public static final int COCA_COLA_PRICE = 10;
    int  countCoffe;
    int countTea;
    int countLemonade;
    int countMineral;
    int countCocaCola;
    int countMojito;
    int totalPrice;
    int totalDrinks;

    public void makeCoffe() {
        System.out.println("Делаю Кофе ... ");
        countCoffe++;
        totalDrinks += countCoffe;
        totalPrice += Drinks.COFFEE_PRICE;
    }
    public void makeTea() {
        System.out.println("Делаю Чай ... ");
        countTea++;
        totalDrinks += countTea;
        totalPrice += Drinks.TEA_PRICE;
    }
    public void makeLemonade(){
        System.out.println("Делаю Лимонад ... ");
        countLemonade++;
        totalDrinks += countLemonade;
        totalPrice += Drinks.LEMONADE_PRICE;
    }
    public void makeMineral(){
        System.out.println("Делаю Минералку ... ");
        countMineral++;
        totalDrinks += countMineral;
        totalPrice += Drinks.MINERAL_PRICE;
    }
    public void makeCocaCola(){
        System.out.println("Делаю CocaCola ... ");
        countCocaCola++;
        totalDrinks += countCocaCola;
        totalPrice += Drinks.COCA_COLA_PRICE;
    }
    public void makeMojito(){
        System.out.println("Делаю Мохито ... ");
        countMojito++;
        totalDrinks += countMojito;
        totalPrice += Drinks.MOJITO_PRICE;
    }
    public void endPraper(){
        System.out.println("Вы заказали " + totalDrinks + " напитков.");
        System.out.println("Сумма к оплате " + totalPrice + " грн.");
    }
}
