public class Min_max {

    public static int getMin(int arr[]){
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;

    }
    public static int getMax(int arr[]){
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }


    public static void main(String[] args) {
        int arr[] = {23,45,35,100,482,3};
        
        System.err.println("Max is: "+ getMax(arr) + " & "  + " Min is : " + getMin(arr));
        
    }
    
}
