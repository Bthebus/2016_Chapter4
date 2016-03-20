package za.ac.cput.composition;

/**
 * Author       : Braedy Thebus
 * Email        : Bthebus2@gmail.com
 * Date Created : 20/03/2016
 */
public class Person {

    private final String NAME;
    private final String SURNAME;

    public Person(String name, String surname) {
        this.NAME = name;
        this.SURNAME = surname;
    }

    public String getNAME() {
        return NAME;
    }

    public String getSURNAME() {
        return SURNAME;
    }

}
