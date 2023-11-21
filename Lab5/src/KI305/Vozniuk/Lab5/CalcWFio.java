package KI305.Vozniuk.Lab5;

import java.io.*;
import java.util.Scanner;
/**
 * Class calculating WFio
 */
class CalcWFio {
    private double result;
    /**
     * Method calculate tg(x)
     */
    public void calculate(double x) {
        if (x == 90 || x == -90){
            System.out.println("You entered incorrect values");
            System.exit(0);
        }else {
            double radians = Math.toRadians(x);
            result = Math.tan(radians);
        }
    }
    /**
     * Method return result
     */
    public double getResult() {
        return result;
    }
    /**
     * Method write result txt
     */
    public void writeResTxt(String fName) {
        try (PrintWriter f = new PrintWriter(fName)) {
            f.printf("%f", result);
        } catch (FileNotFoundException ex) {
            System.out.print(ex.getMessage());
        }
    }
    /**
     * Method read result txt
     */
    public void readResTxt(String fName) {
        try {
            File f = new File(fName);
            if (f.exists()) {
                try (Scanner s = new Scanner(f)) {
                    result = s.nextDouble();
                }
            } else {
                throw new FileNotFoundException("File " + fName + " not found");
            }
        } catch (FileNotFoundException ex) {
            System.out.print(ex.getMessage());
        }
    }
    /**
     * Method write result bin
     */
    public void writeResBin(String fName) {
        try (DataOutputStream f = new DataOutputStream(new FileOutputStream(fName))) {
            f.writeDouble(result);
        } catch (IOException ex) {
            System.out.print(ex.getMessage());
        }
    }
    /**
     * Method read result bin
     */
    public void readResBin(String fName) {
        try (DataInputStream f = new DataInputStream(new FileInputStream(fName))) {
            result = f.readDouble();
        } catch (IOException ex) {
            System.out.print(ex.getMessage());
        }
    }
}
