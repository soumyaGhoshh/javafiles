public class StringMethodsDemo {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Java Programming";
        String str3 = "  Hello Java  ";
        String str4 = "hello world";
        
        System.out.println("Original String 1: " + str1);
        System.out.println("Original String 2: " + str2);
        System.out.println("Original String 3: " + str3);
        System.out.println("Original String 4: " + str4);
        
        System.out.println("\n=== STRING METHODS DEMO ===");
        
        // 1. Length method
        System.out.println("1. Length of '" + str1 + "': " + str1.length());
        
        // 2. charAt method
        System.out.println("2. Character at index 4 in '" + str1 + "': " + str1.charAt(4));
        
        // 3. substring method
        System.out.println("3. Substring from index 6 of '" + str1 + "': " + str1.substring(6));
        System.out.println("   Substring from 0 to 5 of '" + str1 + "': " + str1.substring(0, 5));
        
        // 4. contains method
        System.out.println("4. Does '" + str1 + "' contain 'World'? " + str1.contains("World"));
        
        // 5. equals method
        System.out.println("5. Are '" + str1 + "' and '" + str4 + "' equal? " + str1.equals(str4));
        
        // 6. equalsIgnoreCase method
        System.out.println("6. Are '" + str1 + "' and '" + str4 + "' equal (ignore case)? " + str1.equalsIgnoreCase(str4));
        
        // 7. toUpperCase and toLowerCase
        System.out.println("7. Uppercase of '" + str2 + "': " + str2.toUpperCase());
        System.out.println("   Lowercase of '" + str2 + "': " + str2.toLowerCase());
        
        // 8. trim method
        System.out.println("8. Trimmed '" + str3 + "': '" + str3.trim() + "'");
        
        // 9. replace method
        System.out.println("9. Replace 'Java' with 'Python' in '" + str2 + "': " + str2.replace("Java", "Python"));
        
        // 10. split method
        System.out.println("10. Split '" + str2 + "' by space:");
        String[] words = str2.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println("   Word " + (i + 1) + ": " + words[i]);
        }
        
        // 11. indexOf method
        System.out.println("11. Index of 'World' in '" + str1 + "': " + str1.indexOf("World"));
        System.out.println("    Index of 'o' in '" + str1 + "': " + str1.indexOf('o'));
        System.out.println("    Last index of 'o' in '" + str1 + "': " + str1.lastIndexOf('o'));
        
        // 12. startsWith and endsWith
        System.out.println("12. Does '" + str1 + "' start with 'Hello'? " + str1.startsWith("Hello"));
        System.out.println("    Does '" + str1 + "' end with 'World'? " + str1.endsWith("World"));
        
        // 13. compareTo method
        System.out.println("13. Compare '" + str1 + "' with '" + str4 + "': " + str1.compareTo(str4));
        System.out.println("    Compare ignore case: " + str1.compareToIgnoreCase(str4));
        
        // 14. isEmpty method
        System.out.println("14. Is '" + str1 + "' empty? " + str1.isEmpty());
        
        // 15. valueOf method (static method)
        int number = 123;
        String numStr = String.valueOf(number);
        System.out.println("15. Convert int " + number + " to String: " + numStr);
        
        // 16. concat method
        System.out.println("16. Concatenate '" + str1 + "' and '" + str2 + "': " + str1.concat(" ").concat(str2));
        
        // 17. matches method (regex)
        System.out.println("17. Does '" + str1 + "' match 'Hello.*'? " + str1.matches("Hello.*"));
        
        // 18. String formatting
        String formatted = String.format("Name: %s, Age: %d, Salary: %.2f", "John", 25, 50000.50);
        System.out.println("18. Formatted String: " + formatted);
        
        // 19. String joining (Java 8+)
        String joined = String.join(" - ", "Apple", "Banana", "Cherry");
        System.out.println("19. Joined String: " + joined);
    }
}