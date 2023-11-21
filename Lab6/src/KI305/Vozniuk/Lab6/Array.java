package KI305.Vozniuk.Lab6;

import java.util.ArrayList;
/**
 * Parameterized class <code>Array</code> implements Array
 */
class Array<T extends Info> {
    private ArrayList<T> arr;

    /**
     * Constructor
     */
    public Array() {
        arr = new ArrayList<T>();
    }


    /**
     * Method find object with the biggest size
     */
    public T findMax() {
        if (!arr.isEmpty()) {
            T max = arr.get(0);
            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(i).compareTo(max) > 0)
                    max = arr.get(i);
            }
            return max;
        }
        return null;
    }

    /**
     * Method add new object to Array
     *
     * @param <code>Info</code> The class value
     */
    public void AddInfo(T Info) {
        arr.add(Info);
        System.out.print("Element added: ");
        Info.print();
    }
    /**
     * Method delete object from Array
     *
     * @param <code>i</code> The index of element of array in Array
     */
    public void DeleteInfo(int i) {
        arr.remove(i);
    }
}

