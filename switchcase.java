import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        int number1 ;
        int number2 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so number1: ");
        number1 = sc.nextInt();
        System.out.println("nhap so number2: ");
        number2 = sc.nextInt();

        switch (number1+number2) {
            case 1:
                 System.out.println("case here 1");
                break;
            case 2:
                System.out.println("case here 2");
                break;
            default:
                 System.out.println("case here 3");
                break;
        }

    }
}
