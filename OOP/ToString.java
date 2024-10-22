package OOP;

public class ToString {
    private int day;
    private int month;

    public ToString (int day , int month) {
        this.day = day;
        this.month = month;
    }
    public int getDay() {
        return day;

    }

    public void setDay(int day) {
         this.day = day;

    }

    @Override
    public String toString() {
        return this.day + "/" + this.month;
    }
}
