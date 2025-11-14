import java.util.Scanner;

public class ArmstrongNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number");
        int number = scanner.nextInt();
        int original = number;
        int sum = 0;

        int temp = number;
        int digits = 0;
        while(temp>0){
            digits++;
            temp = temp/10;
        }

    }
}