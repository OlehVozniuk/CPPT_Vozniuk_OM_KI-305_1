package KI305.Vozniuk.Lab3;
import java.io.FileNotFoundException;
/**
 *  Class App
 *  @version 1.0
 */
public class HumanApp {
    /**
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        Sportsman person = new Sportsman("Сristiano", 25, 185,7 , "healthy","lab4.txt");
        System.out.println(person.getName() + " have: " + person.getAge() + " years old");
        person.ShowIndex();
        person.running(100);
        person.dispose();
    }
}
