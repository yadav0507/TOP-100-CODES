public class Second_min {

    // using two loop

    public static int secondMin(int arr[]){
        int smallest = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }

        int sec_smallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length;i++){
            if(arr[i] != smallest && arr[i] < sec_smallest){
                sec_smallest = arr[i];
            }
        }
        return sec_smallest;
    }

    // using one loop

    public static int getSecondMin(int arr[]){
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < first){
                second = first; 
                first = arr[i];
            }
            else if(second > arr[i]){
                second = arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,23,12,53};

        System.out.println(getSecondMin(arr));

    }
    
}
