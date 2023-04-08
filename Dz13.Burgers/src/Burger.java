import java.sql.Struct;
import java.util.Arrays;

public class Burger {
    private String bun;
    private String[] meat = new String[3];
    private String chees;
    private String green;
    private String mayo;

    public Burger (String bun, String chees, String green, String mayo, String meat) {
        this.bun = bun;
        this.meat[0] = meat;
        this.chees = chees;
        this.green = green;
        this.mayo = mayo;
        System.out.println("Обычный бургер. Состав: " + bun + ", " + meat + ", " + chees + ", " + green + ", " + mayo);
    }

    public Burger (String bun, String chees, String green, String meat) {
        this.bun = bun;
        this.meat[0] = meat;
        this.chees = chees;
        this.green = green;
        System.out.println("Диетический бургер. Состав: " + bun + ", " + meat + ", " + chees + ", " + green);
    }
    public Burger (String bun,  String chees, String green, String mayo, String... meat) {
        this.bun = bun;
        this.meat = meat;
        this.chees = chees;
        this.green = green;
        this.mayo = mayo;
        System.out.println("Бургер с двойным мясом. Состав: " + bun + ", " + Arrays.toString(meat) + ", " + chees + ", " + green + ", " + mayo);
    }
}
