package za.ac.cput.InterfaceSegregationPrinciple.bad;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-25
 */
public class Cellphone implements CellphoneFunction{
    public Cellphone() {
    }

    @Override
    public String makeCall() {
        return "Dialling number ...";
    }

    @Override
    public String receiveCall() {
        return "Incoming call ...";
    }

    @Override
    public String sendText() {
        return "SMS sent ...";
    }

    @Override
    public String receiveText() {
        return "SMS received ...";
    }
}
