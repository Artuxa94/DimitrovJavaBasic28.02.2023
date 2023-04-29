

public class Main {
    public static void main(String[] args) {
    iPhones iphone = new iPhones();

    iphone.call(75768);
    iphone.sms(78987,"Hi iPhone");
    iphone.internet();
    iphone.info();


    System.out.println("---------------------------------");
    Androids android = new Androids();

    android.call(54353453);
    android.sms(53453453,"Hi Androids");
    android.internet();
    android.info();
    android.googlePlay();


    }
}
