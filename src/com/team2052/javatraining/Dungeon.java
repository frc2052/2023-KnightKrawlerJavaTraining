public class Dungeon {
    private final Room[] dungeon = {
        new Room(
            "Room C", //room 0
            1,
            -1,
            -2,
            3,
            false,
            true
        ),
        new Room(
            "Room A", //room 1
            2,
            2,
            0,
            3,
            false,
            false
        ),
        new Room(
            "Room L", //room 2
            1,
            0,
            4,
            3,
            true,
            false
        ),
        new Room(
            "Room E", //room 3
            1,
            1,
            2,
            4,  
            false,
            false
        ),
        new Room(
            "Room B", //room 4
            2,
            4,
            3,
            2,
            false,
            false
        ),
    };

    public Room getRoom(int room) {
        return dungeon [room];
        }
        public int getNextRoom(Direction desiredDirection, int currentRoom) {
            return dungeon[currentRoom].getConnectingRoom(desiredDirection);
            
        }

}
