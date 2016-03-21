package za.ac.cput.SRP.bad;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-21
 */
public interface KettleService {

    public double insertWater(double water);
    public double pourWater(double water);
    public void toggleOnOff(boolean toggle);
    public boolean isOn();
    public double getCurrentVolume();
    public double getCapacity();
    public boolean isFull();
    public void makeTea();
    public void makeCoffee();

}
