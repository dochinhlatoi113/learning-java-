import java.util.Scanner;

public class LoopDoWhile {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        
        // Vòng lặp do-while bắt đầu, nhập giá trị và in ra
        do {
            System.out.println("Nhap so n: ");
            n = sc.nextInt(); // Người dùng nhập lại giá trị n trong mỗi vòng lặp
            
            System.out.println("vong lap thu n = " + n);
        } while (n < 2); // Vòng lặp sẽ tiếp tục cho đến khi n >= 2
        
        sc.close(); // Đóng Scanner sau khi hoàn thành
    }
}
