package KI305.Vozniuk.Lab3;

public class FinancialDetails{
    private int salary;
    private String bankInfo;
    /**
     * Constructor without parametres
     */
    public FinancialDetails() {
        salary = 0;
        bankInfo = "4444 5555 6666 7777";
    }
    /**
     *  Method calculate and return salary
     */
    public int CalculateSalary(){
        salary = (int)(Math.random()*1000 + 4000);
        return salary;
    }
    /**
     *  Method returns salary with taxes
     */
    public int getSalaryWithTaxes(){
        return (int) (0.805 * salary);
    }
    /**
     *  Method returns bankInfo
     */
    public String getBankInfo(){
        return bankInfo;
    }
}





