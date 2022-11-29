public class Dungeon {
    private final Room[] dungeon = {
        new Room(
            "Roon 0",
            1,
            -1,
            -2,
            3,
            false,
            false
        ),
        new Room(
            "Room 1"
            
        )

    };

    public Room getRoom(int room) {
        return dungeon [room];
        }
        public int getNextRoom(Direction desiredDirection, int currentRoom) {
            return dungeon[currentRoom].getConnectingRoom(currentroom);

        }

}
