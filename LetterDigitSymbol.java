import java.util.Scanner;

public class LetterDigitSymbol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a Character");
        char ch = sc.next().charAt(0);
        if (ch>='A'&& ch<='Z'||ch>='a'&&ch<='z'){
            System.out.println("Letter");

        }else if(ch >='0'&& ch<='9'){
            System.out.println("number");

        }else{
            System.out.println("Symbol");
        }
        sc.close();

        
    }
    
}
