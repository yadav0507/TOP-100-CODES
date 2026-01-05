import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class freq_elem {

    public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {
            if (visited[i] == true) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " occurs " + count + "times ");
        }
    }

    public static void countFrequency(int arr[], int n) {
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            int count = 1;

            while (i < n - 1 && arr[i] == arr[i + 1]) {
                i++;
                count++;
            }
            System.out.println(arr[i] + ": " + count);
            count++;

        }
    }

    public static void freqCount(int arr[], int n){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> enrty: map.entrySet()){
            System.out.println(enrty.getKey() + "occures " + enrty);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 12, 12, 12, 13, 13, 13, 14 };
        int n = arr.length;
        freqCount(arr, n);

    }

}
