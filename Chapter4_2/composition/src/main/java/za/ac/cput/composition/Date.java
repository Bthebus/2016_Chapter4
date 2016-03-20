package za.ac.cput.composition;

/**
 * Author       : Braedy Thebus
 * Email        : Bthebus2@gmail.com
 * Date Created : 20/03/2016
 */
public class Date {

    private final int DAY;
    private final int MONTH;
    private final int YEAR;

    public Date(int DAY, int MONTH, int YEAR) {
        this.DAY = DAY;
        this.MONTH = MONTH;
        this.YEAR = YEAR;
    }



    public int getDAY() {

        if(getMONTH()==2)
            if(DAY<1 || DAY > 28)
                return 0;
            else
                return DAY;
        else
            if(DAY<1 || DAY>31)
                return 0;
            else
                return DAY;
    }

    public int getMONTH() {
        if(MONTH<1 || MONTH>12)
            return 0;
        else
            return MONTH;
    }

    public int getYEAR() {
       if(YEAR>2015)
           return 0;
        else
           return YEAR;
        }
}
