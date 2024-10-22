package OOP;

public class MainEqualsAndHasde {
    public static void main(String[] args) {
        EqualsAndHascode eh1 = new EqualsAndHascode(10,20);
        EqualsAndHascode eh2 = new EqualsAndHascode(11,22);
        EqualsAndHascode eh3 = new EqualsAndHascode(10,20);

        System.out.println(eh1.equals(eh2));
        System.out.println(eh1.equals(eh3));
        System.out.println(eh3.hashCode());


    }
}
