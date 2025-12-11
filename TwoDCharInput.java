import java.util.Scanner;

public class TwoDCharInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] arr = new char[3][3];

        System.out.println("Enter 9 characters:");

        // input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        // output
        System.out.println("2D Array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
