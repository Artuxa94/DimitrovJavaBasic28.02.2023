public class Parallelepiped {
    public static void main (String [] args) {
        int sideLength = 4;
        int sideWidth = 5;
        int sideHeight = 6;
        int volume = sideLength*sideWidth*sideHeight;
        int length = sideLength+sideWidth+sideHeight;
        System.out.println("Обьем параллелипипеда = " + volume + ", Сумарная длина всех сторон = " + length);
    }
}
