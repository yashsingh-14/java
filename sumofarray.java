import java.util.Scanner;
public class sumofarray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,10,15,20,25};
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
    }
    
}
