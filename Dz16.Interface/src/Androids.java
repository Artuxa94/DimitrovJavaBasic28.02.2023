public class Androids implements Smartphones, LinuxOS{

    public void call(int number){
        System.out.println("Call " + number);
    }
    public void sms (int number, String message){
        System.out.println("Send massage " + message + " on this number " + number);
    }
    public void internet(){
        System.out.println("google.com");
    }
    public void info(){
        System.out.println("Hello you have 11 version Androids");
    }
    public void googlePlay(){
        System.out.println("Welcome to Google Play");
    }
}
