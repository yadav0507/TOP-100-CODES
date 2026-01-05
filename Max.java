public class Max {

    public static int findMax(int arr[]){
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int arr[] = {2,3,5,12,90};

        System.out.println(findMax(arr));
        
    }
   
}