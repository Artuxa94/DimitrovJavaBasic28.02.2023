import java.util.Arrays;
import java.util.Random;

public class Main {
    public static final int PLAYERS = 25;
    public static final int AGE_MIN = 18;
    public static final int AGE_MAX = 40;
    public static void main(String[] args) {
        int ageRedTeam[] = new int[PLAYERS];
        int ageBlueTeam[] = new int[PLAYERS];
        int sumRedTeam = 0;
        int sumBlueTeam = 0;
        for (int i = 0; i < PLAYERS; i++){
            ageRedTeam[i] = randomeAge(AGE_MIN,AGE_MAX);
            ageBlueTeam[i] = randomeAge(AGE_MIN,AGE_MAX);
        }
        for (int i = 0; i < ageRedTeam.length; i++) {
            sumRedTeam += ageRedTeam[i];
            sumBlueTeam += ageBlueTeam[i];
        }
        System.out.println("Красная команда: " + Arrays.toString(ageRedTeam));
        System.out.println("Синяя команда: " + Arrays.toString(ageBlueTeam));
        System.out.println("Средний возраст Красной команды " + sumRedTeam / PLAYERS);
        System.out.println("Средний возраст Синей команды " + sumBlueTeam / PLAYERS);


    }
    static int randomeAge ( int min, int max ){
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}