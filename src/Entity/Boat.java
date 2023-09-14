/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author David
 */
public class Boat {
    private String registration;
    private Double lenght;
    private Integer manufatureYear;

    public Boat() {
    }

    public Boat(String registration, Double lenght, Integer manufatureYear) {
        this.registration = registration;
        this.lenght = lenght;
        this.manufatureYear = manufatureYear;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Double getLenght() {
        return lenght;
    }

    public void setLenght(Double lenght) {
        this.lenght = lenght;
    }

    public Integer getManufatureYear() {
        return manufatureYear;
    }

    public void setManufatureYear(Integer manufatureYear) {
        this.manufatureYear = manufatureYear;
    }
    
    public double calculateModule(){
//        double module;
//        module = 10*lenght;
        return 10*lenght;
    }

    @Override
    public String toString() {
        return "Boat{" + "registration=" + registration + ", lenght=" + lenght + ", manufatureYear=" + manufatureYear + '}';
    }
}
