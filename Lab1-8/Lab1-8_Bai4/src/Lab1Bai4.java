import java.util.Scanner;

public class Lab1Bai4 {
    public static void main(String[] args) {
        // Khởi tạo Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập các hệ số của phương trình bậc 2 : ax^2 + bx + c = 0
        System.out.print("a : ");
        double a = scanner.nextDouble();
        System.out.print("b : ");
        double b = scanner.nextDouble();
        System.out.print("c : ");
        double c = scanner.nextDouble();
        double delta = (Math.pow(b,2)-4*a*c);
        // Xuất kết quả ra màn hình
        System.out.printf("Delta = %.1f\n", delta);
        System.out.printf("Căn Delta = %.1f\n", Math.sqrt(delta));
        // Đóng Scanner
        scanner.close();
    }
}