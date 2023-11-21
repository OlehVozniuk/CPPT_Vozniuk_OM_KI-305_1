package KI305.Vozniuk.Lab6;

class Vector2D implements Info {
    private String Vector2DName;
    private int Vector2DHeight;

    /**
     * Constructor
     *
     * @param <code>sName</code> The name of Vector2D
     * @param <code>sWeight</code> The weight of Vector2D
     */
    public Vector2D(String sName, int sHeight) {
        Vector2DName = sName;
        Vector2DHeight = sHeight;
    }

    /**
     * Method return name of Vector2D
     *
     * @return Vector2DName
     */
    public String getName() {
        return Vector2DName;
    }

    /**
     * Method set name of Vector2D
     *
     * @param <code>n</code> The Vector2DName
     */
    public void setName(String name) {
        Vector2DName = name;
    }

    /**
     * Method return height of Vector2D
     *
     * @return height
     */
    public int getHeight() {
        return Vector2DHeight;
    }

    /**
     * Method set height of Vector2D
     *
     * @param <code>n</code> The Vector2DHeight
     */
    public void setHeight(int n) {
        Vector2DHeight = n;
    }

    /**
     * Method compare objects type Info
     *
     * @param <code>p</code> The weight of object
     * @return num (0, 1, -1)
     */
    public int compareTo(Info p) {
        Integer s = Vector2DHeight;
        return s.compareTo(p.getHeight());
    }

    /**
     * Method print information about Vector2D
     */
    public void print() {
        System.out.print("Vector2D Name: " + Vector2DName + ",Vector2D Height: " + Vector2DHeight + ";\n");
    }
}



