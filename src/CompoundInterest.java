import java.util.Scanner;

public class CompoundInterest {
    public void Interest() {


        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter Principal Amount");
        double principal = stdin.nextDouble();

        System.out.println("Enter Expected Interest Rate");
        double interestRate = stdin.nextDouble();
        double interestRateInDecimal = interestRate / 100;
        System.out.println("Enter Expected Duration of Investment in Years");
        int time = stdin.nextInt();
        int n = 12;
        double amount = principal * Math.pow((1 + interestRateInDecimal / n), (n * time));
        System.out.println("Investment balance after " + time + " years: " + amount);

    }
}
