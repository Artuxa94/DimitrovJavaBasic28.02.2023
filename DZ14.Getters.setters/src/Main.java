import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
    PersonFitness roma = new PersonFitness("Рома",
            "Кукушкин",
            27,
            4,
            1992,
            "poma@gavgav.com",
            "095324242",
            60,
            "120/60",
            10000);

    roma.calcAge();
    roma.printAccountInfo();
    roma.setWeight(80);
    roma.setStepsPerDay(5000);
    roma.printAccountInfo();

        PersonFitness dima = new PersonFitness("Дима",
                "Синичкин",
                14,
                3,
                1994,
                "dima@gavgav.com",
                "05023423442",
                55,
                "100/60",
                30000);

        dima.calcAge();
        dima.printAccountInfo();
        dima.setWeight(50);
        dima.setPressure("60/60");
        dima.printAccountInfo();

        PersonFitness kolya = new PersonFitness("Коля",
                "Ласточкин",
                21,
                8,
                1997,
                "kolya@gavgav.com",
                "09723423442",
                150,
                "200/90",
                69);

        kolya.calcAge();
        kolya.printAccountInfo();
        kolya.setStepsPerDay(68);
        kolya.setWeight(155);
        kolya.setLastName("Инсультович");
        kolya.printAccountInfo();

    }
}
