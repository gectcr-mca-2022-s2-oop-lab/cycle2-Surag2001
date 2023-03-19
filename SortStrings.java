import java.util.Scanner;
import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings");
        int no = sc.nextInt();
        String[] array = new String[no];
        array[0] = sc.nextLine();           //necessary to remove considering the first 'enter' after the no. of input as a string

        System.out.println("Enter " + no + " strings:");
        for(int i = 0; i < no; i++) 
            array[i] = sc.nextLine();
        
        Arrays.sort(array);
        
        System.out.println("\nThe array of strings after sorting is:");
        for(int i = 0; i < no; i++) 
            System.out.println(array[i]);

        sc.close();
    }
}
