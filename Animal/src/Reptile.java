public class Reptile extends Animal{
    // does not get "parents" constructors
    // does get all methods

    public Reptile(){
        //there is an implicit super(); called here
        // this calls "parents method"
        // every constructor has that call

        //this.name = "ralph";
        super("ralph");
    }


    public Reptile(String name) {
        super(name);
    }

    public void eat(String thing){
        System.out.println(this.name + " eats " + thing + " like a rep");
    }

    public void move(){
        System.out.println(this.name + " moving like a creep");
    }


}
