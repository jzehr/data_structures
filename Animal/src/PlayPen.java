public class PlayPen {
    public static void main(String[] args) {
        Animal a = new Animal("bob");
        a.move();
        a.eat("pizza");
        System.out.println("\n");

        Reptile r = new Reptile();
        r.move();
        r.eat("dog");
        System.out.println("\n");

        Lizard l = new Lizard();
        l.move();
        l.eat("fish");
        System.out.println("\n");

        Snake s = new Snake();
        s.move();
        s.eat("mouse");
        System.out.println("\n");


        /*
        polymorphism part


        // can do this
        //Animal q = new Reptile();

        // cannot do this
        //Reptile l = new Animal();

        // can only grab method from the parent, unless you cast
        Animal m = new Lizard();
        m.move();

        // collections of objects is great for polymorphisms
        Animal[] zoo = new Animal[5];
        zoo[0] = new Animal("Gary the Gorilla");
        zoo[1] = new Animal();
        zoo[2] = new Reptile();
        zoo[3] = new Lizard();
        zoo[4] = new Snake();

        for (int i = 0; i < zoo.length; i++) {
            Animal h = zoo[i];
            h.move();
            h.eat("pizza");
        }
        */

        // for each loop, do not know index, just given item
        // very quick
        int[] arr = {7,8,2,5,6,1,3};
        for(int x : arr){
            System.out.println(x);
        }

        Animal[] zoo = {new Snake(), new Animal(), new Lizard()};
        for(Animal w : zoo){
            w.move();
            w.eat("fishes");
            if(w instanceof Snake){
                System.out.println("found one!!");
            }

        }

        // instance of operator



    }

}
