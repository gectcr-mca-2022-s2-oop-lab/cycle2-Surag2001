import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[1]; 

        System.out.println("Enter integers (Enter a non-integer to escape...)");
        do {
            try {
                array[array.length - 1] = Integer.parseInt(br.readLine());
                array = Arrays.copyOf(array, array.length + 1);
            } catch (NumberFormatException e) {
                array = Arrays.copyOf(array, array.length - 1);
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
