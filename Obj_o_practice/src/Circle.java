public class Circle {
    private double radius;
    public static final double PI = 3.14159;
    private static int num_cirlces = 0;

    public Circle(double radius){
        this.radius = radius;
        num_cirlces ++;
    }

    public static int get_num_cirlces() {
        return num_cirlces;
    }

    public double area(){
        return PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle with radius --> " + radius;

    }


}
