/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author David
 */
public class Rent {
    private String clientName;
    private String clientNID;
    private LocalDate rentDate;
    private LocalDate returnDate;
    private Integer hangingPlace;
    private Boat boat;
    private Double price;

    public Rent() {
    }

    public Rent(String clientName, String clientNID, LocalDate rentDate, LocalDate returnDate, Integer hangingPlace, Boat boat, Double price) {
        this.clientName = clientName;
        this.clientNID = clientNID;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.hangingPlace = hangingPlace;
        this.boat = boat;
        this.price = price;
    }
    
    

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientNID() {
        return clientNID;
    }

    public void setClientNID(String clientNID) {
        this.clientNID = clientNID;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Integer getHangingPlace() {
        return hangingPlace;
    }

    public void setHangingPlace(Integer hangingPlace) {
        this.hangingPlace = hangingPlace;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }
    
    //Other Methods
    public Double calculatePrice(){
        Double calculatedPrice = null;
        
        Long longBetweenDates = ChronoUnit.DAYS.between(rentDate,returnDate);
        if (longBetweenDates != null){
            calculatedPrice =(double) longBetweenDates;
            calculatedPrice = calculatedPrice*10 + boat.calculateModule();
            //donde dice 80 va el modulo de los barcos
        }
        
        return calculatedPrice;
    }

    @Override
    public String toString() {
        return "Rent{" + "clientName=" + clientName + ", clientNID=" + clientNID + ", rentDate=" + rentDate + ", returnDate=" + returnDate + ", hangingPlace=" + hangingPlace + ", boat=" + boat + '}';
    }
    
    
    
}
