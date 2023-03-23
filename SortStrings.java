import java.util.Scanner;
//import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings");
        int no = sc.nextInt();
        String[] array = new String[no];
        array[0] = sc.nextLine();
        //the above line is necessary to remove considering the first 'enter' as a string after getting the no. of strings
        //this is not a problem if BufferedReader is used

        System.out.println("Enter " + no + " strings:");
        for(int i = 0; i < no; i++)
            array[i] = sc.nextLine();
        
        for(int i = 0; i < no-1; i++) {
        	String small = array[i];
        	
        	for(int j = i + 1; j < no; j++) {
        		if(small.compareTo(array[j]) > 0) {
        			small = array[j];
        			array[j] = array[i];
        			array[i] = small;        			
        		}
        	}
        }
        
        System.out.println("\nThe array of strings after sorting is:");
        for(int i = 0; i < no; i++) 
            System.out.println(array[i]);

        sc.close();
    }
}
