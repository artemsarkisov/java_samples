package refactorings;

public class Cube {
    private final double width;
    private final double length;
    private final double height;

    public Cube(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double getVolume() {
        return width * length * height;
    }

    public static void main(String[] args) {
        Cube cube = new Cube(1.0, 2.0, 5.0);

        System.out.println(cube.getVolume());
    }
}


//    public Cube(double width, double length) {
//        if (width < 0) {
//            width = 0;
//        }
//        this.width = width;
//        if (length < 0) {
//            length = 0;
//        }
//        this.length = length;
//    }

//    public double getWidth() {
//        return width;
//    }

//    public void setWidth(double width) {
//        if (width < 0) {
//            width = 0;
//        }
//        this.width = width;
//    }

//    public double getLength() {
//        return length;
//    }

//    public void setLength(double length) {
//        if (length < 0) {
//            length = 0;
//        }
//        this.length = length;
//    }