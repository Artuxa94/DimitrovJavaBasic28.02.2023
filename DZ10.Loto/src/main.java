import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int randomNumb ( int min, int max ){
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
    public static void main(String[] args) {
        int[] luckyTicket = new int[7];
        int[] userTicket = new int [7];
        int min = 0;
        int max = 9;
        int coincidences = 0;
        for (int i = 0; i < 7; i++){
            luckyTicket[i] = randomNumb(min, max);
            userTicket[i] = randomNumb(min, max);
        }
        Arrays.sort(luckyTicket);
        Arrays.sort(userTicket);
        for (int i = 0; i <luckyTicket.length && i < userTicket.length; i++){
            if (luckyTicket[i] == userTicket[i]) {
                coincidences++;
            }
        }
        System.out.println(Arrays.toString(luckyTicket) + " - Выиграшные номера Лото Забава");
        System.out.println(Arrays.toString(userTicket) + " - Номера твоего билетика");
        System.out.println("Количество совпадений: " + coincidences);
    }
}