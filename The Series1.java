import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        
        int sum = 0;
        int term = 2;
        
        for (int i = 1; i <= n; i++) {
            sum += term;
            term += 30;
        }
        
        System.out.println("The sum of the series is: " + sum);
        
        scanner.close();
    }
}