package com.ps;

public class HotelOperations {
    public static void main(String[] args) {
        Room room1 = new Room(1, 159, true, false, false);
        System.out.println(room1.isAvailable());
        Reservation reservation = new Reservation("king", 3, false);
    }



}
