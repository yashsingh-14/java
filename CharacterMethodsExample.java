public class CharacterMethodsExample {

    public static void main(String[] args) {

        char ch1 = 'A';
        char ch2 = 'a';
        char ch3 = '5';
        char ch4 = '@';
        char ch5 = '7';

        // 1. isLetter
        System.out.println("isLetter('A') : " + Character.isLetter(ch1));

        // 2. isDigit
        System.out.println("isDigit('5') : " + Character.isDigit(ch3));

        // 3. isLetterOrDigit
        System.out.println("isLetterOrDigit('@') : " + Character.isLetterOrDigit(ch4));

        // 4. isUpperCase
        System.out.println("isUpperCase('A') : " + Character.isUpperCase(ch1));

        // 5. isLowerCase
        System.out.println("isLowerCase('a') : " + Character.isLowerCase(ch2));

        // 6. toUpperCase
        System.out.println("toUpperCase('a') : " + Character.toUpperCase(ch2));

        // 7. toLowerCase
        System.out.println("toLowerCase('A') : " + Character.toLowerCase(ch1));

        
    }
}