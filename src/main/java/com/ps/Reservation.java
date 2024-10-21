package com.ps;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class Reservation {
   private String roomType;
    private int numberOfNights;
    private boolean isWeekend;
    private int price;
    private double ReservationTotal;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend, int price, double reservationTotal) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.price = price;
        ReservationTotal = reservationTotal;
    }

    public Reservation(String king, int numberOfNights, boolean isWeekend) {
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public float getPrice(float price){
        if(this.roomType.equalsIgnoreCase("king")) {
            price = 139.00f;
        } else price = 124.00f;{
            //(this.roomType.equals("double"))
        }
        if(isWeekend)
            price *= 1.1;

        return price;
    }
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double getReservationTotal() {
        return price * numberOfNights;
    }

    public void setReservationTotal(double reservationTotal) {
        ReservationTotal = reservationTotal;
    }

    public boolean isWeekend(){
        LocalDate date = LocalDate.now();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        if(dayOfWeek.name().equalsIgnoreCase("Saturday") || dayOfWeek.name().equalsIgnoreCase("Sunday"))
            return true;
        else return false;
    }

}
