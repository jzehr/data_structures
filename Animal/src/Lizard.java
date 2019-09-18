public class Lizard extends Reptile {
    public Lizard(){
        this.name = "LizBoi";
    }

    public Lizard(String name){
        super(name);
    }

    public void eat(String thing){
        System.out.println(this.name + " eats " + thing + " like a lizard");
    }

    public void move(){
        System.out.println(this.name + " scurries away");
    }


}
