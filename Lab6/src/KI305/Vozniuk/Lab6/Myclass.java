package KI305.Vozniuk.Lab6;
public class Myclass<T1, T2> implements myinterface<T1, T2> {

    @Override
    public void print_data(T1 data1, T2 data2) {
        System.out.println("Data 1: " + data1);
        System.out.println("Data 2: " + data2);
    }
}
