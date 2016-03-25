package za.ac.cput.LiskovSubstitutionPrinciple.bad;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-25
 */
public class Kettle extends KettleFunctions {

    public Kettle() {
    }

    @Override
    public boolean toggleSwitch()
    {
        return super.toggleSwitch();
    }

    @Override
    public boolean pourWater() {
        return true;
    }
}
