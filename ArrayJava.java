import java.util.Scanner;

public class ArrayJava {
    public static void main(String[] args) {
        double[] mang1;
        double mang2[];
        // Tạo mảng với kích thước 10 (bắt buộc)
        mang1 = new double[3];
        double temp = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < mang1.length; i++) {
            System.out.println("Nhap gia tri thu " + (i + 1) + ": ");
            mang1[i] = sc.nextDouble(); // Sửa thành nextDouble để nhập kiểu double
            System.out.println("Gia tri da nhap: " + mang1[i]);
            temp = mang1[i] + temp;
            System.out.println("Tong gia tri: " + temp);
        }

        sc.close(); // Đóng scanner sau khi hoàn thành
    }
}
