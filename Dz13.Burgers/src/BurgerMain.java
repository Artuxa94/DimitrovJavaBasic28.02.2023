public class BurgerMain {
    public static void main(String[] args) {
        Burger simplyBurger = new Burger(
                "Американская булка",
                "Галандский сыр",
                "Пекинская капуста",
                "Барбикю",
                "Говядина"
        );
        Burger dietBurger = new Burger(
                "Французкая булка",
                "Гуада",
                "Огурчик",
                "Курица"
        );
        Burger bigMeat = new Burger(
                "Украинская булка",
                "Хохланд",
                "Авакадо",
                "Острый соус",
                "Свинина","Говядина"
        );
    }
}