package quizes.q3.nikoloz_eriashvili_1;

public class Room {
    private int roomNumber;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public String toString() {
        return "Room number: " + roomNumber;
    }
}