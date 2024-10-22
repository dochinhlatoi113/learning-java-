import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        int x = 1;
        Scanner sc = new Scanner(System.in);
        while (x!= 0){
            System.out.println("nhap x = 0  de thoat,nhập số khac 0 de tiep tuc");
            x = sc.nextInt();
        }
    }
}
