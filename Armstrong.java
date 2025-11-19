import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int sum = 0;

        int d=String.valueOf(n).length();


        while (n>0) {
            int digit = n % 10;
            sum += Math.pow(digit,d);
            n /= 10;
            
        }
        if 
        (sum == original) 
        System.out.println(original+"  Armstrong Number");
        else
        System.out.println(original+" Is Not Armstrong");
    }
}