import java.util.Scanner;
public class LibraryMath {
    public static void main(String[] args) {
        double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a: ");
        a = sc.nextDouble();
        System.out.println("|a| = " + Math.abs(a));
    } 
}
