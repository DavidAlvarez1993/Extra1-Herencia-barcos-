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
public class LuxuryYatch extends MotorBoat {
    protected Integer cabinNumber;

    public LuxuryYatch() {
    }

    public LuxuryYatch(Integer cabinNumber) {
        this.cabinNumber = cabinNumber;
    }

    public Integer getCabinNumber() {
        return cabinNumber;
    }

    public void setCabinNumber(Integer cabinNumber) {
        this.cabinNumber = cabinNumber;
    }
    
    @Override
    public double calculateModule(){
//        double calculateModule = super.calculateModule();
        return super.calculateModule() + cabinNumber;
    }

    @Override
    public String toString() {
        return "LuxuryYatch{" + "cabinNumber=" + cabinNumber + '}';
    }
}
