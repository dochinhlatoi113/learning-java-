package OOP.Inheritance;

public class MainInherit extends Inherit {
    private String nameClass;

    public MainInherit(String name, int age, String nameClass) {
        super(name, age);
        this.nameClass = nameClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

}
