package KI305.Vozniuk.Lab6;

/**
 * Class Lab6VozniukKI305 realize example program to lab work 6
 *
 * @author Vozniuk Oleg
 * @version 1.1
 */
public class App {
    public static void main(String[] args) {
//        Array<? super Info> Array = new Array<>();
//        Array.AddInfo(new Vector3D("Vec1", 120, 35));
//        Array.AddInfo(new Vector2D("Vec2", 100));
//        Array.AddInfo(new Vector2D("Vec3", 40));
//        Array.AddInfo(new Vector3D("Vec4", 95, 10));
//        Info res1 = Array.findMax();
//        System.out.print("The biggest vector in the Array has: \n");
//        res1.print();
        Myclass<String, Integer> implementation = new Myclass<>();
        implementation.print_data("Hello", 42);
    }
}