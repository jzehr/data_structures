public class Point {
    // attributes of the class -- instance variables
    private int x;
    private int y;

    // constructors
    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int get_x(){
        return x;
    }

    public int get_y(){
        return y;
    }

    public void set_x(int x) {
        this.x = x;
    }

    public void set_y(int y) {
        this.y = y;
    }

    // behaviors -- instance methods
    public void print_this_point(){
        System.out.println("coords --> " + "(" + this.x + "," + this.y + ")");
    }

    public void increment_x_and_y(){
        this.x = this.x + 1;
        this.y = this.y + 1;
    }
    // returns distance between this point and another point called p
    public double distance(Point p){
        int dx = this.x - p.x;
        int dy = this.y - p.y;

        return Math.sqrt( Math.pow(dx,2) + Math.pow(dy,2) );

    }

    public static double distance(Point p1, Point p2){
        int dx = p1.x - p2.x;
        int dy = p1.y - p2.y;

        return Math.sqrt( Math.pow(dx,2) + Math.pow(dy,2) );
    }
}
