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
public class MotorBoat extends Boat{
    protected Integer power;

    public MotorBoat() {
    }

    public MotorBoat(Integer power) {
        this.power = power;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Override
    public double calculateModule(){
//        double calculateModule = super.calculateModule();
        return super.calculateModule() + power;
    }
    
    @Override
    public String toString() {
        return "MotorBoat{" + "power=" + power + '}';
    }
}
