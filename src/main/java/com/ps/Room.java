package com.ps;

public class Room {
    private int NumbberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isAvailable;
    private boolean isDirty;


    public Room(int numbberOfBeds, double price, boolean isOccupied, boolean isAvailable, boolean isDirty) {
        NumbberOfBeds = numbberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isAvailable = isAvailable;
        this.isDirty = isDirty;
    }

    public int getNumbberOfBeds() {
        return NumbberOfBeds;
    }

    public void setNumbberOfBeds(int numbberOfBeds) {
        NumbberOfBeds = numbberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied(){
        return this.isOccupied;
    }
    public boolean isAvailable(){
        return isOccupied() || isDirty();
    }
    public boolean isDirty(){
        return this.isDirty;

    }
    public void checkIn(){

    }
    public void checkOut(){

    }
    public void cleanRoom(){

    }

}
