package za.ac.cput.SRP.bad.impl;

import za.ac.cput.SRP.bad.services.KettleService;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-21
 */
public class Kettle implements KettleService {

    private boolean toggle = false;
    private double currentVolume = 0;

    //CAPACITY measured in ml
    private final double CAPACITY = 1500;

    public Kettle() {
    }

    @Override
    public boolean isFull()
    {
        if(currentVolume>=CAPACITY)
            return true;

        return false;
    }

    @Override
    public boolean isOn()
    {
        return toggle;
    }

    @Override
    public double insertWater(double water) {
        return currentVolume+=water;
    }

    @Override
    public double pourWater(double water) {

        return currentVolume-=water;
    }

    @Override
    public void toggleOnOff(boolean toggle) {
        this.toggle = toggle;
    }

    @Override
    public double getCurrentVolume() {
        return currentVolume;
    }

    @Override
    public double getCapacity() {
        return CAPACITY;
    }

    @Override
    public void makeTea() {
        System.out.println("1 cup of tea made.");
    }

    @Override
    public void makeCoffee() {
        System.out.println("1 cup of coffee made.");
    }
}
