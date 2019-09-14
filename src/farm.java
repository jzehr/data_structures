import java.awt.*;

public class farm {

    int tractor_num;
    String farm_name;
    Color barn_color;
    boolean cows;

    public farm(int input_tractor_num,
               String input_farm_name,
               Color input_barn_color,
               boolean input_cows) {
        this.tractor_num = input_tractor_num;
        this.farm_name = input_farm_name;
        this.barn_color = input_barn_color;
        this.cows = input_cows;
    }

    public void change_barn_color(Color new_barn_color){
        this.barn_color = new_barn_color;
    }

    public int more_tractors(int current_number) {
        current_number += 1;
        return current_number;
    }

    public void name_change(String current_name){
        this.farm_name = current_name.toUpperCase();
    }

}
