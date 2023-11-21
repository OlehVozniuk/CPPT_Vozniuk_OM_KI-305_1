package KI305.Vozniuk.Lab4;

import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

/**
 * Class EquationsApp demonstrate program
 *
 * @version 1.0
 */
public class EquationsApp{

    /**
     *  Method main
     *  @param args
     */
    public static void main(String[] args) {
        try {
            out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fName));
            try {
                try {
                    Equations eq = new Equations();
                    out.print("Enter X: ");
                    fout.print(eq.calculate(in.nextInt()));
                } finally {
                    fout.flush();
                    fout.close();
                }
            } catch (CalcException ex) {
                out.print(ex.getMessage());
            }
        } catch (FileNotFoundException | WrongPathFileException ex) {
            out.print("Exception reason: Perhaps wrong file path");
            throw new WrongPathFileException("Exception reason: Perhaps wrong file path");
        }
    }
}
