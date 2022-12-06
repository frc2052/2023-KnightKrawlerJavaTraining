public class Dungeon {
    private final Rooms[]dungeon = {
        new Rooms(
            "Room Alligator", //room 0
            1,
            -1,
            4,
            3,
            false,
            false
        ),
        
        new Rooms(
            "Room Bear", //room 1
            3,
            0,
            2,
            -1,
            false,
            false    
        ),

        new Rooms(
            "Room Crocodile", //room 2
            1,
            -1,
            -1,
            -1,
            false,
            true
        ),

        new Rooms(
            "Room Eagle", //room 3
            2,
            4,
            0,
            1,
            false,
            false
        ),

        new Rooms(
            "Room Lizard", //room 4
            1,
            0,
            3,
            5,
            false,
            false
        ),

        new Rooms(
            "Room DEATH", //room 5
            -1,
            -1,
            -1,
            -1,
            true,
            false
        )

    };

    public Rooms getRoom(int room){
        return dungeon [room];
    }


    public int getNextRoom(Direction desiredDirection, int currentRoom) {
        return dungeon[currentRoom].getConnectingRoom(desiredDirection);
    }
}
