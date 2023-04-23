 public class iPhones implements Smartphones, iOS{
    public void call(int number){
        System.out.println("Call " + number);
    }
    public void sms (int number, String message){
        System.out.println("Send massage " + message + " on this number " + number);
    }
    public void internet(){
        System.out.println("Apple.com");
    }

     public void info(){
        System.out.println("Hello you have 15 version iOS");
    }
    public void appStore(){
        System.out.println("Welcome to App Store");
    }

}
