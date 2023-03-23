import java.util.Scanner;

public class StringMethods {
    static String string;

    static String answer(int option) {
        String s, str;
        Scanner sc = new Scanner(System.in);
        int index;

        switch(option) {
            case 1: 	s = "The number of characters in the string is " + string.length();
                    	break;
            case 2: 	System.out.println("Input index:");
                    	index = sc.nextInt();
                    	s = "The character at index " + index + " is " + string.charAt(index);
                    	break;
            case 3: 	System.out.println("Input index:");
            			index = sc.nextInt();
            			s = "The substring from " + index + "th index character is " + string.substring(index);
            			break;
            case 4: 	System.out.println("Input starting and ending index:");
            			int index1 = sc.nextInt(), index2 = sc.nextInt();
            			s = "The substring from index " + index1 + " to index " + index2 + " is " + string.substring(index1, index2); 
            			break;
            case 5: 	System.out.println("Input a string:");
            			str = sc.next();
            			s = "The concatenated string is " + string.concat(str);
            			break;
            case 6: 	System.out.println("Input a string:");
    					str = sc.next();
    					s = "The index of first occurrence of " + str + " in " + string + " is " + string.indexOf(str);
    					break;
            case 7: 	System.out.println("Input a string:");
						str = sc.next();
						System.out.println("Input a starting index:");
						index = sc.nextInt();
						s = "The index of first occurrence of " + str + " in " + string + " starting from index " + index + " is " + string.indexOf(str, index);
						break;
            case 8: 	System.out.println("Input a string:");
						str = sc.next();
						s = "The index of last occurrence of " + str + " in " + string + " is " + string.lastIndexOf(str);
						break;
            case 9: 	s = "The lower case form of " + string + " is " + string.toLowerCase();
            			break;
            case 10:	s = "The upper case form of " + string + " is " + string.toUpperCase();
            			break;
            case 11:	s = "The trimmed version of " + string + " is " + string.trim();
            			break;
            case 12:	System.out.println("Enter 2 characters");
            			char ch1 = sc.next().charAt(0), ch2 = sc.next().charAt(0);
            			s = "The new string replacing all occurrences of \'" + ch1 + "\' with \'" + ch2 + "\' in " + string + " is " + string.replace(ch1, ch2);
            			break;
            default: return "The string without any manipulation is " + string;
        }

        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string");
        string = sc.nextLine();
        
        System.out.println("\nThe major string methods are:");
        System.out.println("1.  int length()");
        System.out.println("2.  Char charAt(int i)");
        System.out.println("3.  String substring (int i)");
        System.out.println("4.  String substring (int i, int j)");
        System.out.println("5.  String concat( String str)");
        System.out.println("6.  int indexOf (String s)");
        System.out.println("7.  int indexOf (String s, int i)");
        System.out.println("8.  int lastIndexOf( String s)");
        System.out.println("9.  String toLowerCase()");
        System.out.println("10. String toUpperCase()");
        System.out.println("11. String trim()");
        System.out.println("12. String replace (char oldChar, char newChar)");

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