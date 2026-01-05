public class Min {

    public static int getMin(int arr[]){
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,42,42,12};

        System.out.println(getMin(arr));
        
    }
    
}
