package Task3;

import org.junit.jupiter.api.Test;

import static Task3.Main.countLampsInBuilding;
import static Task3.Main.isNormal;
import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void countLampsEqualsTotal() {
        Room room1 = new Room(0, 5,0);
        Room room2 = new Room(0, 10,0);
        Room room3 = new Room(0, 15,0);
        Room[] rooms = new Room[3];

        // Add rooms
        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;

        // Instantiate building
        Building building = new Building(rooms, 1, 1, false);
        assertEquals(30, countLampsInBuilding(building));
    }

    @Test
    void isNormalSame() {
        Room room1 = new Room(0, 5,0);
        Room room2 = new Room(0, 10,0);
        Room room3 = new Room(0, 15,0);
        Room[] rooms = new Room[3];

        // Add rooms
        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;

        // Instantiate building
        Building building = new Building(rooms, 1, 3, false);

        assertFalse(isNormal(building));
    }

    @Test
    void isNormalGreater() {
        Room room1 = new Room(0, 5,0);
        Room room2 = new Room(0, 10,0);
        Room room3 = new Room(0, 15,0);
        Room[] rooms = new Room[3];

        // Add rooms
        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;

        // Instantiate building
        Building building = new Building(rooms, 1, 4, false);

        assertTrue(isNormal(building));
    }

    @Test
    void isNormalLess() {
        Room room1 = new Room(0, 5,0);
        Room room2 = new Room(0, 10,0);
        Room room3 = new Room(0, 15,0);
        Room[] rooms = new Room[3];

        // Add rooms
        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;

        // Instantiate building
        Building building = new Building(rooms, 1, 2, false);

        assertFalse(isNormal(building));
    }


}