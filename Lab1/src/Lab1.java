import java.io.*;
import java.util.*;
/**
 * Клас Lab1 реалізує приклад програми до лабораторної роботи No1
 */
public class Lab1 {
    /**
     * Статичний метод main є точкою входу в програму *
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        char[][] arr;
        char symbol;

        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);
        System.out.print("Введіть розмір квадратної матриці: ");
        nRows = in.nextInt();
        in.nextLine();
        arr = new char[nRows][];
        for (int i = 0; i < nRows; i++) {
            arr[i] = new char[i + 1];
        }
        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine();

        exit:

        for (int i = nRows - 1; i > 0; i--) {
            for (int space = 0; space < nRows - i; space++) {
                System.out.print("  ");
                fout.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                if (filler.length() == 1) {

                    symbol = (char) filler.codePointAt(0);

                    if (i % 2 == 1 && j % 2 != 1) {
                        symbol = '*';
                    }
                    arr[i][j] = symbol;
                    System.out.print(arr[i][j] + " ");
                    fout.print(arr[i][j] + " ");
                } else if (filler.length() == 0) {
                    System.out.print("\nНе введено символ заповнювач");
                    break exit;
                } else {
                    System.out.print("\nЗабагато символів заповнювачів");
                    break exit;
                }
            }
            System.out.print("\n");
            fout.print("\n");
        }
        fout.flush();
        fout.close();
    }
}