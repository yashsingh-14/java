import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String (whole line)
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();

        // // String (single word)
        // System.out.print("Enter your nickname: ");
        // String nickname = sc.next(); // stops at space

        // int
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // long
        System.out.print("Enter your phone number: ");
        long phone = sc.nextLong();

        // float
        System.out.print("Enter your height in meters (e.g. 1.75): ");
        float height = sc.nextFloat();

        // double
        System.out.print("Enter your GPA: ");
        double gpa = sc.nextDouble();

        // boolean
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        // byte
        System.out.print("Enter a small number (byte): ");
        byte smallNumber = sc.nextByte();

        // short
        System.out.print("Enter a medium number (short): ");
        short mediumNumber = sc.nextShort();

        // char (read a string, then get first char)
        System.out.print("Enter your grade (A/B/C...): ");
        char grade = sc.next().charAt(0);

        // Output
        System.out.println("\n--- Output Summary ---");
        System.out.println("Full Name: " + fullName);
        // System.out.println("Nickname: " + nickname);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Height: " + height + "m");
        System.out.println("GPA: " + gpa);
        System.out.println("Student: " + isStudent);
        System.out.println("Small Number: " + smallNumber);
        System.out.println("Medium Number: " + mediumNumber);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}