package za.ac.cput.SRP.good.impl;

import za.ac.cput.SRP.good.services.ImprovedKettleService;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-21
 */
public class ImprovedKettle implements ImprovedKettleService {

    private boolean toggle = false;
    private double currentVolume = 0;

    //CAPACITY measured in ml
    private final double CAPACITY = 1500;

    public ImprovedKettle() {
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
}
