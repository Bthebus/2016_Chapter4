package za.ac.cput.SRP.good.services;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-21
 */
public interface ImprovedKettleService {
    public double insertWater(double water);
    public double pourWater(double water);
    public void toggleOnOff(boolean toggle);
    public boolean isOn();
    public double getCurrentVolume();
    public double getCapacity();
    public boolean isFull();
}
