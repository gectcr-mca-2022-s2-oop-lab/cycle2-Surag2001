import java.util.Scanner;
//https://www.geeksforgeeks.org/string-class-in-java/
public class StringMethods {
    static String string;

    static String answer(int option) {
        String s;
        Scanner sc = new Scanner(System.in);

        switch(option) {
            case 1: s = "The number of characters in the string is " + string.length();
                    break;
            case 2: System.out.print("Input index:\t");
                    int index = sc.nextInt();
                    s = "The character at index " + index + " is " + string.charAt(index);
                    break;
            


            default: return "The string without any manipulation is " + string;
        }

        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string");
        string = sc.nextLine();
        
        System.out.println("The major string methods are:");
        System.out.println("1.  int length()");
        System.out.println("2.  Char charAt(int i)");
        System.out.println("3.  String substring (int i)");
        System.out.println("4.  String substring (int i, int j)");
        System.out.println("5.  String concat( String str)");
        System.out.println("6.  int indexOf (String s)");
        System.out.println("7.  int indexOf (String s, int i)");
        System.out.println("8.  int lastIndexOf( String s)");
        System.out.println("9.  boolean equals( Object otherObj)");
        System.out.println("10. boolean  equalsIgnoreCase (String anotherString)");
        System.out.println("11. int compareTo( String anotherString)");
        System.out.println("12. int compareToIgnoreCase( String anotherString)");
        System.out.println("13. String toLowerCase()");
        System.out.println("14. String toUpperCase()");
        System.out.println("15. String trim()");
        System.out.println("16. String replace (char oldChar, char newChar)");

        do {
            System.out.println("\nEnter an option (1 to 16) [Input any other no. to exit]");
            int option = sc.nextInt();
            if(option >= 1 && option <= 16)
                System.out.println(answer(option));
            else
                break;    
        } while(true);

        sc.close();
    }
}