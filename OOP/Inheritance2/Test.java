package OOP.Inheritance2;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog(null);
        d.eat();
        d.bark();
        BabyDog bd = new BabyDog(null);
        bd.eat();
        bd.weep();
    }
}
