import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.util.Set;

public class PersonFitness {
    private final String firstName;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;

    private final String email;
    private final String phoneNumb;
    private String lastName;
    private int weight;
    private String pressure;
    private int stepsPerDay;
    private int age;

    public PersonFitness(String firstName,
                         String lastName,
                         int birthDay,
                         int birthMonth,
                         int birthYear,
                         String email,
                         String phoneNumb,
                         int weight,
                         String pressure,
                         int stepsPerDay) {

        this.firstName = firstName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phoneNumb = phoneNumb;
        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsPerDay = stepsPerDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumb() {
        return phoneNumb;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public int getStepsPerDay() {
        return stepsPerDay;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public int getAge() {
        return age;
    }


    public void printAccountInfo() {

        String date = "PersonFitness{" +
                "Имя: " + firstName +
                ", Фамилия: " + lastName +
                ", Дата Рождения: " + birthDay + "." + birthMonth + "." + birthYear +
                ", email: " + email  +
                ", Номер телефона: " + phoneNumb +
                ", Вес: " + weight +
                ", Давление: " + pressure +
                ", Шаги за день: " + stepsPerDay +
                ", Возраст: " + age +
                '}';
        System.out.println(date);
    }
    public void calcAge() {
        LocalDate dateNow = LocalDate.now();
        Period period = Period.between(LocalDate.of(birthYear,birthMonth,birthDay), dateNow);
        age = period.getYears();
    }

}
