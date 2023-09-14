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
public class SailBoat extends Boat{
    protected Integer mastsNumber;

    public SailBoat() {
    }

    public SailBoat(Integer mastsNumber) {
        this.mastsNumber = mastsNumber;
    }

    public Integer getMastsNumber() {
        return mastsNumber;
    }

    public void setMastsNumber(Integer mastsNumber) {
        this.mastsNumber = mastsNumber;
    }
    
    @Override
    public double calculateModule(){
//        double calculateModule = super.calculateModule();
        return super.calculateModule() + mastsNumber;
    }

    @Override
    public String toString() {
        return "SailBoat{" + "mastsNumber=" + mastsNumber + '}';
    }
}
