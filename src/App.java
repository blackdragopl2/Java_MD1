import models.Employee;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Person one = new Person();
        Person oneFull = new Person("Valentins", "Koļcovs", "180301-20309");
        Person oneMistakes = new Person("1Klov", "Asm", "1233-2345");
        Employee two = new Employee();
        Employee twoFull = new Employee("Valentins", "Koļcovs", "180301-20309", 2022, (byte)03, (byte)35);
        Employee twoMistakes = new Employee ("Valent1s", "Ko5covs", "123456-12345", 2022, (byte)03, (byte)23);
        System.out.println(one);
        System.out.println(oneFull);
        System.out.println(oneMistakes);
        System.out.println(two);
        System.out.println(twoFull);
        System.out.println(twoMistakes);
    }
}
