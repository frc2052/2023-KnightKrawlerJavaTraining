public class Room {
    private boolean visted = false;
    private final String description; 

    public final int northConnectedRoom;
    public final int southConnectedRoom;
    public final int eastConnectedRoom;
    public final int westConnectedRoom;
    private final boolean isDeathRoom;
    private final boolean isWinningRoom;

    public Room(
        String description,
        int northConnectedRoom,
        int southConnectedRoom,
        int eastConnectedRoom,
        int westConnectedRoom,
        boolean inDeathRoom,
        boolean inWinningRoom
         ){
            this.description = description;
            this.northConnectedRoom = northConnectedRoom;
            this.southConnectedRoom = southConnectedRoom;
            this.eastConnectedRoom = eastConnectedRoom;
            this.westConnectedRoom = westConnectedRoom;
            this.isDeathRoom = isDeathRoom;
            this.isWinningRoom = isWinningRoom;
         }
    pubic String getDescription() {
        String modifiedDescription;
        if (visited) { 
            modifiedDescription = "you have re-entered" + description; }
        else {
            modifiedDescription = "you have entered" + description; }
            return modifiedDescription;
    }
    public int getConnectingRoom(Direction direction){}
}

