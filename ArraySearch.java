import java.io.*;
import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[1]; 
        int size = 1;

        System.out.println("Enter integers (Enter a non-integer to escape...)");
        do {
            try {
                array[array.length - 1] = Integer.parseInt(br.readLine());
                array = Arrays.copyOf(array, ++size);
            } catch (NumberFormatException e) {
                array = Arrays.copyOf(array, --size);
                break;
            }
        } while(true);

        System.out.println("Enter an integer to search:\t");
        int num = Integer.parseInt(br.readLine());
        boolean flag = false;

        for(int i=0; i < array.length; i++) {
            if(array[i] == num) {
                System.out.println(num + " is found in this array at position " + (i+1));
                flag = true;
                break;
            }
        }

        if(!flag)
            System.out.println(num + " is not found in this array");  
    }
}
