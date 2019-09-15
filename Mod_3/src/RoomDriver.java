public class RoomDriver {
    public static void main(String[] args) {
        Room r = new Room(4);
        System.out.println("number in room --> " + r.getNumber());
        System.out.println("added one to room --> " + r.addOneToRoom());
        System.out.println("removed one from room --> " + r.removeOneFromRoom());
        System.out.println("total in all rooms --> " + r.getTotal());
        System.out.println("\n");

        Room j = new Room(6);
        System.out.println("number in room --> " + j.getNumber());
        System.out.println("added one to room --> " + j.addOneToRoom());
        System.out.println("removed one from room --> " + j.removeOneFromRoom());
        System.out.println("total in all rooms --> " + j.getTotal());
        System.out.println("\n");

        Room k = new Room(2);
        System.out.println("number in room --> " + j.getNumber());
        System.out.println("added one to room --> " + j.addOneToRoom());
        System.out.println("removed one from room --> " + j.removeOneFromRoom());
        System.out.println("total in all rooms --> " + j.getTotal());
        System.out.println("\n");

    }
}
