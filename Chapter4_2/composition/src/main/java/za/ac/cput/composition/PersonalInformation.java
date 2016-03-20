package za.ac.cput.composition;

/**
 * Author       : Braedy Thebus
 * Email        : Bthebus2@gmail.com
 * Date Created : 20/03/2016
 */
public class PersonalInformation {
    private  final Person person;
    private  final Date dob;
    private final String ID;

    public PersonalInformation(String name, String surname, int day, int month, int year, String ID) {
        this.person = new Person(name, surname);
        this.dob = new Date(day, month, year);
        this.ID = ID;
    }
    public Person getPerson() {
        return person;
    }
    public Date getDob() {
        return dob;
    }
    public String getID() {
        return ID;
    }
}
