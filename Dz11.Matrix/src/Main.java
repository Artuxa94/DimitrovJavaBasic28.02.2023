import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        Random randomNumb = new Random();

        System.out.println("Введите размер матрицы M: ");
        int m = scan.nextInt();
        System.out.println("Введите размер матрицы N: ");
        int n = scan.nextInt();

        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++){ // Заполнение матрицы случайными числами
            for (int j = 0; j < n; j++){
                matrix[i][j] = randomNumb.nextInt(10);
            }
        }
        System.out.println("Матрица с вашими параметрами: M = " + m + ", N = " + n);
        for (int i = 0; i < m; i++){ // Вывод матрицы в консоль с помощью цикла
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        int [][] transponMatrix = new int[n][m]; // Транспонирование матрицы
        for (int i = 0; i < m; i++){
            for ( int j = 0; j < n; j++){
                transponMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("Транспонированая матрица: N = " + n + ", M = " + m);
        for (int i = 0; i < n; i++){ // Вывод транспонированой матрицы в консоль
            for (int j = 0; j < m; j++){
                System.out.print(transponMatrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        System.out.println("Исходная матрица:");
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("Транспонированая матрица:");
        System.out.println(Arrays.deepToString(transponMatrix));






    }
}
