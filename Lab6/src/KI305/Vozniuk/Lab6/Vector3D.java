package KI305.Vozniuk.Lab6;

class Vector3D implements Info {
    private String VectorName;
    private int height;
    private int length;

    /**
     * Constructor
     *
     * @param <code>hName</code> The vector name
     * @param <code>pLive</code>   The vector height
     * @param <code>pSize</code>   The vector length
     */
    public Vector3D(String hName, int hHeight, int hLength) {
        VectorName = hName;
        height = hHeight;
        length = hLength;
    }

    /**
     * Method return Vector3D name
     *
     * @return VectorName
     */
    public String getVectorName() {
        return VectorName;
    }

    /**
     * Method set Vector name for Vector3D
     *
     * @param <code>name</code> The Vector name
     */
    public void setVectorName(String name) {
        VectorName = name;
    }

    /**
     * Method return length in the Vector3D
     *
     * @return length
     */
    public int getLength() {
        return length;
    }

    /**
     * Method set length in the Vector3D
     *
     * @param <code>n</code> The length
     */
    public void setLength(int n) {
        length = n;
    }

    /**
     * Method return height of Vector3D
     *
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Method compare objects type Info
     *
     * @param <code>p</code> The weight of object
     * @return num (0, 1, -1)
     */
    public int compareTo(Info p) {
        Integer s = height;
        return s.compareTo(p.getHeight());
    }

    /**
     * Method print information about Vector3D
     */
    public void print() {
        System.out.print("Vector3D: " + VectorName + ", Length: " + length +
                ", Vector height: " + height + ";\n");
    }


}