package OOP;

import java.util.Objects;

/**
 * EqualsAndHascode
 */
// hascode : hàm bâm
public class EqualsAndHascode {

    private int day;
    private int month;

    public EqualsAndHascode(int day,int month) {
        this.day = day;
        this.month = month;
    }

    public int getDay(){
        return day;
    }

    public void setDay(int d){
        if(d < 31) {
            this.day = d;
        }else{
            System.out.println("wrong format day");
        }
         
    }

    public int getMonth(){
        return month;
    }

    public void setMonth(int m){
        if(m  < 12)
         this.month = m;
         else  {
            System.out.println("wrong format month");
         }
    }
    //equals
    @Override
    public boolean equals(Object obj) {
        System.out.println("day la >>" + obj);
        if(this == obj) return true;
        if(this == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        EqualsAndHascode eh = (EqualsAndHascode) obj;
        if(this.day !=eh.day) return false;
        if(this.month !=eh.month) return false;
        return true;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(day, month);
    }
}