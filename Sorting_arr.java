
import java.util.Arrays;
public class Sorting_arr {

    public static void printOrder(int[] arr, int n){
        Arrays.sort(arr);

        for(int i = 0; i < n / 2; i++){
            System.out.println(arr[i]);
        }

        for(int j = n - 1; j >= n/2; j--){
            System.out.println(arr[j]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,2,6,1,6,8,34,90};
        int n = arr.length;

        printOrder(arr, n);
        
    }
    
}
