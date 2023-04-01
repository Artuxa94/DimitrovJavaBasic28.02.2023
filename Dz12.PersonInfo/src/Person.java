public class Person {
    public String name;
    public String surName;
    public String city;
    public String phoneNumb;

    public Person (String name, String surName, String city, String phoneNumb) {
        this.name = name;
        this.surName = surName;
        this.city = city;
        this.phoneNumb = phoneNumb;
    }

    public String personInfo() {
        return "Зателефонувати громадянину " + name + " " + surName + " із міста " + city + " можна за номером - " + phoneNumb;
    }
}

