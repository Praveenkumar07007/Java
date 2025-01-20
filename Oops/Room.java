public class Room {
    int height;
    int width;
    int breadth;

    public Room() {
    }

    public int volume() {
        return height * width * breadth;
    }
}

class RoomDemo extends Room {
    public static void main(String[] args) {
        Room room = new Room();
        room.height = 10;
        room.width = 15;
        room.breadth = 20;
        System.out.println("Volume of the room: " + room.volume());
    }
}


//Create a class “Room” which will hold the “height”, “width” and “breadth” of the room in three
//fields. This class also has a method “volume()” to calculate the volume of this room. Create
//another class “RoomDemo” which will use the earlier class, create instances of rooms, and
//display the volume of room.