package OOP.Inheritance;

public class Test {
    public static void main(String[] args) {
        Inherit i = new Inherit("khuong", 29);
        System.out.println("day la lop cha >>"+ i.getName());
        MainInherit mh = new MainInherit("k", 29,"fpt");
        System.out.println("day la lop con ke thua  >>" + mh.getNameClass());
    }
}
