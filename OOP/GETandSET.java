package OOP;

public class GETandSET {
    private int day;
    private int month;

    public GETandSET(int day,int month) {
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
}
