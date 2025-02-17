import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args) {
        // Khởi tạo Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập chiều dài
        System.out.print("Chiều dài: ");
        double a = scanner.nextDouble();
        
        // Nhập chiều rộng
        System.out.print("Chiều rộng: ");
        double b = scanner.nextDouble();
        
        // Xuất kết quả ra màn hình
        System.out.printf("Chu vi = %.1f\n", (a + b)*2);
        System.out.printf("Diện tích = %.1f\n", a * b);
        System.out.printf("Cạnh nhỏ nhất = %.1f", Math.min(a,b));
        // Đóng Scanner
        scanner.close();
    }
}