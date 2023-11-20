/**
 * lab 2 package
 */
package KI305.Vozniuk.Lab2;
import java.io.FileNotFoundException;
/**
 *  Class App
 *  @version 1.0
 */
public class HumanApp {

    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Human person1 = new Human("Yura Martyniuk",25,180.5,70.5, "healthy", "Lab2.txt");
        System.out.println("Your name is: " + person1.getName());
        System.out.println("Your age is: " + person1.getAge());
        System.out.println("Your weight is: " + person1.getWeight());
        System.out.println("Your height is: " + person1.getHeight());
        person1.ShowIndex();
        person1.TestResultsHealth();
        System.out.println("Your card is using for salary: " + person1.getBankInfo());
        System.out.println("Your salary is: " + person1.getSalary());
        System.out.println("Your salary with taxes is: " + person1.getSalaryWithTaxes());
        person1.dispose();
    }
}
