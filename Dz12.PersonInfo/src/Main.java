public class Main {
    public static void main(String[] args) {
    Person person1 = new Person("Artur","Dimitrov","Berdyansk","5435435352");
    Person person2 = new Person("Alexandra","Dodarrio","Los Angeles","432442423");
    Person person3 = new Person("Emily","Ratajkowski", "New Yourk", "435657468765");
        System.out.println(person1.personInfo());
        System.out.println(person2.personInfo());
        System.out.println(person3.personInfo());
    }
}