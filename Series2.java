import java.util.Scanner;

public class Series2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        
        System.out.println("The sum of the series is: " + sum);
        
        scanner.close();
    }
}