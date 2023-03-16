package Task3;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(1, 2,1);
        Room room2 = new Room(2, 7,3);
        Room room3 = new Room(1, 4,0);

        // Add rooms to collection
        Room[] rooms = new Room[3];

        // Add rooms
        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;

        // Instantiate building
        Building building = new Building(rooms, 1, 1, false);
    }

    public static int countLampsInBuilding(Building building) {
        int total = 0;
        for(Room r: building.getRooms()){
            total += r.getNumberOfLamps();
        }
        return total;
    }

    public static boolean isNormal(Building building) {
        if(building.getNumberOfFloors() > building.getRooms().length) {
            return true;
        }
        System.out.println("This is an odd building");
        return false;
    }
}
