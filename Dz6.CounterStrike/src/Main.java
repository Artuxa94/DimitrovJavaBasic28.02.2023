import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название команды CounterTerrorist: ");
        String ctName = scan.nextLine();
        System.out.println("Введите название команды Terrorist: ");
        String tName = scan.nextLine();
        int numberPlayers = 5;
        int[] ctKills = new int[5];
        int[] tKills = new int[5];
        int sumCt = 0;
        int sumT = 0;
        System.out.println("Введите количество фрагов каждого игрока команды CounterTerrorist " + ctName);
        System.out.println( ctName + "<>Player 1: ");
        ctKills[0] = scan.nextInt();
        System.out.println( ctName + "<>Player 2: ");
        ctKills[1] = scan.nextInt();
        System.out.println( ctName + "<>Player 3: ");
        ctKills[2] = scan.nextInt();
        System.out.println( ctName + "<>Player 4: ");
        ctKills[3] = scan.nextInt();
        System.out.println( ctName + "<>Player 5: ");
        ctKills[4] = scan.nextInt();
        for (int i = 0; i < ctKills.length; i++) {
            sumCt += ctKills[i];
        }
        System.out.println("Введите количество фрагов каждого игрока команды Terrorist " + tName);
        System.out.println( tName + "<>Player 1: " );
        tKills[0] = scan.nextInt();
        System.out.println( tName + "<>Player 2: " );
        tKills[1] = scan.nextInt();
        System.out.println( tName + "<>Player 3: " );
        tKills[2] = scan.nextInt();
        System.out.println( tName + "<>Player 4: " );
        tKills[3] = scan.nextInt();
        System.out.println( tName + "<>Player 5: " );
        tKills[4] = scan.nextInt();
        for (int i = 0; i < tKills.length; i++) {
            sumT += tKills[i];
        }
        double averegCt = sumCt/numberPlayers;
        double averegT = sumT/numberPlayers;

        if (sumCt > sumT) {
            System.out.println("Выиграла команда " + ctName + " набрала " + sumCt + " очков," + "среднее арефмитическое количестов очков " + averegCt);
          }
         else if (sumCt < sumT) {
            System.out.println("Выиграла команда " + tName + " набрала " + sumT + " очков," + "среднее арефмитическое количестов очков " + averegT );
        }
        else {
            System.out.println("Ничья!!!");
            System.out.println("Результат команды " + ctName + " " + sumCt + " очков," + "среднее арефмитическое количестов очков " + averegCt);
            System.out.println("Результат команды " + tName + " " + sumT + " очков," + "среднее арефмитическое количестов очков " + averegT);
        }
    }
}