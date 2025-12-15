import java.util.Scanner;

public class LowercaseOrUppercase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch= sc.next().charAt(0);
        if(ch>='A'&& ch<='Z'){
            System.out.println("Uppercase Letter");

        }else if(ch>='a'&& ch<='z'){
            System.out.println("Lowercase letter");

        }else{
            System.out.println("Not an alphabet");
        }
        sc.close();
        
    }
    
}
