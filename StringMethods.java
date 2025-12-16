class StringMethods {
    public static void main(String[] args) {
        // String str = "Avenger Assemble";
        String str = new String("Avenger Assemble");
        
        // 1. length()
        System.out.println("Length: " + str.length()); // 16

        // 2. charAt(index)
        System.out.println("Character at index 3: " + str.charAt(3)); // 'n'

        // 3. toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase()); // "AVENGER ASSEMBLE"

        // 4. toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase()); // "avenger assemble"

        // 5. substring(beginIndex)
        System.out.println("Substring from index 8: " + str.substring(8)); // "Assemble"

        // 6. substring(beginIndex, endIndex)
        System.out.println("Substring (0, 7): " + str.substring(0, 7)); // "Avenger"

        // 7. equals()
        System.out.println("Equals 'Avenger Assemble': " + str.equals("Avenger Assemble")); // true

        // 8. equalsIgnoreCase()
        System.out.println("EqualsIgnoreCase 'avenger assemble': " + str.equalsIgnoreCase("avenger assemble")); // true

        // 9. contains()
        System.out.println("Contains 'Assemble': " + str.contains("Assemble")); // true

        // 10. replace()
        System.out.println("Replace 'Assemble' with 'United': " + str.replace("Assemble", "United")); // "Avenger
                                                                                                      // United"

        // 11. indexOf()
        System.out.println("Index of 'A': " + str.indexOf('A')); // 0

        // 12. isEmpty()
        String emptyStr = "";
        System.out.println("Is empty string empty? " + emptyStr.isEmpty()); // true

        // 13. trim()
        String messy = "     Avenger   Assemble     ";  // Trim the space from starting and Ending of the String.   
        System.out.println("Trimmed: '" + messy.trim() + "'"); // "Avenger Assemble"

        // 14. startsWith()
        System.out.println("Starts with 'Avenger': " + str.startsWith("Avenger")); // true

        // 15. endsWith()
        System.out.println("Ends with 'Assemble': " + str.endsWith("Assemble")); // true

    }
}