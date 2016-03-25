package za.ac.cput.LiskovSubstitutionPrinciple.good;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-25
 */
public class ImprovedKettle extends KettleFunction {

    public ImprovedKettle() {
    }

    @Override
    public boolean pourWater() {
        return true;
    }

    @Override
    public boolean toggleSwitch() {
        return true;
    }
}
