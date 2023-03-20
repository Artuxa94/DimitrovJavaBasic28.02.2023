import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randomNumb =(int) (Math.random()*10);
        int attemps = 3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Задача угадать число от 1 до 10, у тебя 3 попытки. ");
        while (attemps > 0) {
            System.out.println("Введи свое число: ");
            int userNumb = scan.nextInt();
            if (randomNumb == userNumb) {
                System.out.println("Ты выиграл, правильное число " + randomNumb);
                break;
            } else if (randomNumb != userNumb) {
                attemps--;
                System.out.println("Неправильное число, у тебя осталось " + attemps + " попытки.");
            }
        } if (attemps == 0) {
            System.out.println("Ты проиграл, загаданое число было " + randomNumb);
        }
    }
}