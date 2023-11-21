/**
 * lab 2 package
 */
package KI305.Vozniuk.Lab3;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 *  Class Human
 *  @version 1.0
 */

public class Human {
    private String name;
    private AthleteDetails athletics;
    private HealthRecords health;
    private FinancialDetails finances;
    private PrintWriter fout;

    /**
     * Constructor
     *
     * @param name       person name
     * @param height     person height
     * @param weight     person weight
     * @param weight     person HealthResults
     * @param outPutFile output file
     * @throws FileNotFoundException
     */
    public Human(String name , int age, double height, double weight, String HealthResults, String outPutFile) throws FileNotFoundException{
        this.name = name;
        athletics = new AthleteDetails(age, height, weight);
        health = new HealthRecords(HealthResults);
        finances = new FinancialDetails();
        fout = new PrintWriter(new File(outPutFile));
    }
    /**
     * this.name = name; athletics = new AthleteDetails(age, height, weight);
     * health = new HealthRecords(HealthResults); finances = new FinancialDetails();
     * fout = new PrintWriter(new File(outPutFile));
     * <p>
     * Method to return name
     */
    public String getName(){
        return name;
    }
    /**
     *  Method returns age
     */
    public int getAge(){
        return athletics.getAge();
    }
    /**
     *  Method returns height
     */
    public double getHeight(){
        return athletics.getHeight();
    }
    /**
     *  Method returns weight
     */
    public double getWeight(){
        return  athletics.getWeight();
    }
    /**
     *  Method for calculation weight index
     */
    public void ShowIndex(){
        athletics.idx();
    }
    /**
     *  Method for calculation is person need to get vaccinated
     */
    public void health(){
        if (health.getHealthResults().equals("healthy")) {
            System.out.println("You don't need get vaccinated");
            fout.println("You don't need get vaccinated");
            fout.flush();
        }else if(health.getHealthResults().equals("unhealthy")){
            System.out.println("You should get vaccinated");
            fout.println("You should get vaccinated");
            fout.flush();
        }else{
            System.out.println("You entered incorrect values");
            fout.println("You entered incorrect values");
            fout.flush();
        }
    }


    /**
     *  Method returns random salary from 4000 to 5000
     */
    public int getSalary(){
        return finances.CalculateSalary();
    }
    /**
     *  Method returns salary with 19.5% taxes
     */
    public int getSalaryWithTaxes(){
        return finances.getSalaryWithTaxes();
    }
    /**
     *  Method returns BankInfo
     */
    public String getBankInfo(){
        return finances.getBankInfo();
    }
    /**
     *  Method exits
     */
    public void dispose(){
        fout.flush();
        fout.close();
    }
}


