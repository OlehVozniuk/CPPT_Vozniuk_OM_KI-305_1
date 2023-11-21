package KI305.Vozniuk.Lab3;
import java.io.FileNotFoundException;


interface ISportsman{
    void running(int metres);
}

/**
 *  Class Sportsman
 *  @version 1.0
 */
public class Sportsman extends Human implements ISportsman{
    /**
     *  Constructor
     *  @param name person name
     *  @param height person height
     *  @param weight person weight
     *  @param HealthResults person weight
     *  @param outPutFile output file
     *  @throws FileNotFoundException
     */
    public Sportsman(String name , int age, double height, double weight, String HealthResults,String outPutFile) throws FileNotFoundException{
        super(name, age, height, weight, HealthResults,outPutFile);
    }
    /**
     *  Constructor to calculating how many matres Name have to run in seconds
     */
    public void running(int metres)
    {
        System.out.println("Olympic  running standarts for sportmen to run: " + metres + " metres");
        int sec = metres/7;
        System.out.println(super.getName() + " have to finish running in " + sec + " seconds");
    }
}

