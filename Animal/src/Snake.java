public class Snake extends Reptile {
    public Snake(){
        this.name = "sally";
    }

    public Snake(String name){
        super(name);
    }


    public void move(){
        System.out.println(this.name + " slithers away");
    }



}
