public class String_Functions {
    public static boolean compareStrings(String str1, String str2){
        return str1.equals(str2);
    }
    public static String copyString(String original){
        return new String(original);
    }
    public static String concatenateString(String str1, String str2){
        return str1 + str2;
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";
        System.out.println("String Comparison:");
        System.out.println("Are the strings equal? " + compareStrings(s1,s2));
        System.out.println();

        String original = "Copy me!";
        String copied = copyString(original);
        System.out.println("String Copy:");
        System.out.println("Original string: " + original);
        System.out.println("Copied string: " + copied);
        System.out.println();

        String part1 = "Hello, ";
        String part2 = "world!";
        String concatenated = concatenateString(part1,part2);
        System.out.println("String Concatenation:");
        System.out.println("Concatenated string: " + concatenated);
    }
}

/*
Output:

String Comparison:
Are the strings equal? false

String Copy:
Original string: Copy me!
Copied string: Copy me!

String Concatenation:
Concatenated string: Hello, world!
*/