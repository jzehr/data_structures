public class Room {
    // variables

    //numberInRoom --> instance variable
    private int numberInRoom;

    //totalNumber --> shared among all instances of room, not a shared constant
    //make it private
    private static int totalNumber;


    public Room(int numberInRoom) {
        this.numberInRoom = numberInRoom;
        totalNumber += numberInRoom;
    }

    // methods

    public int addOneToRoom() {
        return numberInRoom + 1;
    }


    public int removeOneFromRoom() {
        return numberInRoom - 1;
    }

    public int getNumber() {
        return this.numberInRoom;
    }

    public int getTotal() {
        return this.totalNumber;
    }



}


