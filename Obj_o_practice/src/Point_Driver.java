public class Point_Driver {

    public static void main(String[] args) {
        Point p1 = new Point(5,7);
        Point p2 = new Point(-2,2);
        Point p3 = new Point();

        Point p4 = new Point(3,4);

        p1.print_this_point();
        p2.print_this_point();

        p1.increment_x_and_y();
        p1.print_this_point();
        p2.increment_x_and_y();
        p2.print_this_point();

        p3.print_this_point();

        System.out.println(p4.distance(p3));

        System.out.println(Point.distance(p1, p2));
    }
}
