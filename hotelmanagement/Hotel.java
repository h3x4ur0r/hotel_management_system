package hotelmanagement;

import java.util.Scanner;

public class Hotel {
    private Room[] rooms;

    public Hotel(Room[] rooms) {
        this.rooms = rooms;
    }

    // Display available rooms in the hotel
    public void displayAvailableRooms() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            if (!room.isOccupied()) {
                System.out.println(room);
            }
        }
    }

    // Check-in a guest to a room
    public void checkIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter room number: ");
        int roomNumber = scanner.nextInt();

        Room room = findRoom(roomNumber);
        if (room != null) {
            if (room.isOccupied()) {
                System.out.println("Room " + roomNumber + " is already occupied.");
            } else {
                System.out.print("Enter guest name: ");
                String guestName = scanner.next();
                room.setGuestName(guestName);
                room.setOccupied(true);
                System.out.println("Guest " + guestName + " checked into room " + roomNumber + ".");
            }
        } else {
            System.out.println("Room " + roomNumber + " does not exist.");
        }
        scanner.close();
    }

    // Check-out a guest from a room
    public void checkOut() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter room number: ");
        int roomNumber = scanner.nextInt();

        Room room = findRoom(roomNumber);
        if (room != null) {
            if (room.isOccupied()) {
                String guestName = room.getGuestName();
                room.setGuestName("");
                room.setOccupied(false);
                System.out.println("Guest " + guestName + " checked out of room " + roomNumber + ".");
            } else {
                System.out.println("Room " + roomNumber + " is not occupied.");
            }
        } else {
            System.out.println("Room " + roomNumber + " does not exist.");
        }
        scanner.close();
    }

    // Find a room by its number
    private Room findRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }
}
