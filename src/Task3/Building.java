package Task3;

public class Building {
    private final Room[] rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuidling;

    public Building(Room[] rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuidling) {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuidling = isOfficeBuidling;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuidling() {
        return isOfficeBuidling;
    }
}
