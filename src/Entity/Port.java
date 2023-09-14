/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Port {

    private List<Boolean> hangingPlaces;
    private List<Boat> availableBoats = new ArrayList<>();
    
    public static void createBoats(){
        Boat boat1 = new Boat();
        Boat boat2 = new Boat();
        Boat boat3 = new MotorBoat();
        Boat boat4 = new LuxuryYatch();
        Boat boat5 = new SailBoat();
        Boat boat6 = new SailBoat();
    }
    
    public void addBoats(){
        availableBoats.add(new Boat("BCA123",15.5,1999));
        availableBoats.add(new Boat("GFT567",17.8,2011));
        availableBoats.add(new MotorBoat(17,"ADT947",23.8,2013));
        availableBoats.add(new LuxuryYatch(38,17,"AKJ296",20.7,2009));
        availableBoats.add(new SailBoat(17,"UYM456",19.1,2011));
        availableBoats.add(new SailBoat(17,"IUY095",20.8,2014));
    }    

    public void showBoats() {
        availableBoats.forEach(System.out :: println);
    }
    
    public String chooseBoat(){
        System.out.println("Choose the boat you want to rent. Enter the registration code.");
        Scanner input = new Scanner(System.in);
        String inputRegistration = input.next();
        return inputRegistration;
    }
    
    public Boat checkBoat(String inputRegistration){
        for (Boat boat : availableBoats) {
            if (boat.getRegistration().equalsIgnoreCase(inputRegistration)) {
                return boat; // Found a match, return the boat
            }
        }
        return null; // If no matching boat is found
    }
    

}
