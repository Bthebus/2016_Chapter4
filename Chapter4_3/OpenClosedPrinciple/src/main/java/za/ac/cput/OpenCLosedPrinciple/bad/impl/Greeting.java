package za.ac.cput.OpenCLosedPrinciple.bad.impl;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-21
 */
public class Greeting {

    private String formality;
    public Greeting()
    {
    }
    public Greeting(String formality)
    {
        this.formality = formality;
    }

    public String getGreeting()
    {
        String msg= "Hello.";
        switch(formality)
        {
            case "Formal":
                msg= "Good Evening good sir!";
                break;
            case "Casual":
                msg= "Howsit going bru?";
                break;
            case "Intimate":
                msg ="Hey babe!";
                break;
            default: return msg;
        }
        return msg;
    }
}
