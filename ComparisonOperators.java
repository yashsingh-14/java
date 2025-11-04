public class ComparisonOperators {

    public static void main(String[] args) {
        
        // Equal to
        boolean resultEqual = (5 == 5);
        System.out.println("Equal to: " + resultEqual);

        // Not equal to
        boolean resultNotEqual = (10 != 5);
        System.out.println("Not equal to: " + resultNotEqual);

        // greater than
        boolean resultGreaterThan = (8 > 3);
        System.out.println("Greater than: " + resultGreaterThan);

        // less than
        boolean resultLessThan = (4 < 9); // Corrected logic: 4 is less than 9
        System.out.println("Less than: " + resultLessThan);

        // greater than or equal to
        boolean resultGreaterEqual = (7 >= 7);
        System.out.println("Greater than or equal to: " + resultGreaterEqual);

        // less than or equal to
        boolean resultLessEqual = (3 <= 3); // Corrected logic: 3 is equal to 3
        System.out.println("Less than or equal to: " + resultLessEqual);
    }
}