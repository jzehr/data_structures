import java.awt.*;

public class Car {
    // double -> has decimal 12.3
    // String -> "asd3D"
    // Color -> from awt library

    double a_mpg;
    String license_plate;
    Color paint_color;
    boolean tail_lights;

    public Car(double input_a_mpg,
                String input_license_plate,
                Color input_paint_color,
                boolean input_tail_lights) {
        this.a_mpg = input_a_mpg;
        this.license_plate = input_license_plate;
        this.paint_color = input_paint_color;
        this.tail_lights = input_tail_lights;
    }
    // signature of method, how method will work
    public void change_paint_color(Color new_paint_color){
        this.paint_color = new_paint_color;

    }

    public double speed_up(double current_speed) {
        current_speed += 100;
        return current_speed;
    }
}
