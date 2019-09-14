public class Circle_Driver {
    public static void main(String[] args) {

        Circle[] circles = new Circle [1000000];

        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i+1);
        }


        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i]);
        }

        Circle c = new Circle(5.4);
        System.out.println(Circle.get_num_cirlces());
        System.out.println(c.toString());

    }
}
