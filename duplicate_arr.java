public class duplicate_arr {

    public static int removeDuplicates(int nums[]){

        int i = 0;

        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;

    }
    public static void main(String[] args) {
        int nums[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};
        int k = removeDuplicates(nums);
        for(int i = 0; i < k; i++){
            System.out.println(nums[i]+" ");
        }
        
    }
    
}
