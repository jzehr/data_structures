

public class Animal {
    // static variables, stored among all variables in class
    // belongs to the class, think of as Global variable
    public static boolean hasCellMembranes = true;

    // these are instance variables //
    // limits who can access
    protected String name;
    private String color;

    public Animal(){
        this("Andrew");
    }

    public Animal(String name){
        this.name = name;
    }

    public void eat(String thing){
        System.out.println(this.name + " eats " + thing);
    }

    public void move(){
        System.out.println(this.name + " moves ");
    }
}
