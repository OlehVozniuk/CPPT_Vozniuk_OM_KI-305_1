package KI305.Vozniuk.Lab2;
import java.io.PrintWriter;
public class AthleteDetails {
    private int age;
    private double height;
    private double weight;
    /**
     * Constructor
     *  @param age person name
     *  @param height person height
     *  @param weight person weight
     */
    public AthleteDetails(int age, double height, double weight)
    {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    /**
     *  Method returns age
     */
    public int getAge(){
        return age;
    }
    /**
     *  Method returns the height
     */
    public double getHeight() {
        return height;
    }
    /**
     *  Method returns the weight
     */
    public double getWeight() {
        return weight;
    }
    /**
     *  Method calculations weight index
     */
    public void idx(){
        double y = height - weight + 10;
        if(y <= weight + 10){
            System.out.println("Your weight index is not normal");
        }else {
            System.out.println("Your weight index is normal");
        }
    }
}


