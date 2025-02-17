import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args) {
        // Khởi tạo Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập cạnh
        System.out.print("Cạnh : ");
        double a = scanner.nextDouble();
        
        // Xuất kết quả ra màn hình
        System.out.printf("Thể tích lập phương = %.1f\n", a * a * a);
        // Đóng Scanner
        scanner.close();
    }
}