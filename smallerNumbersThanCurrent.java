import java.util.ArrayList;
import java.util.Arrays;

public class smallerNumbersThanCurrent {
	public static String smallerNumbersThanCurrent(int[] nums) {
		ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
        	int count =0;
            for(int j=0; j<nums.length; j++){
                if(j!=i && nums[j]< nums[i]){
                    count++; 
                }
            }
            list.add(count);
        }
        
       int[] arr = new int[list.size()];
       for(int i=0; i<list.size(); i++) {
    	   arr[i]= list.get(i);
       }
       return Arrays.toString(arr);
    }
    
    public static void main(String[] args){
        int[] nums = {8,1,2,2,3};
        System.out.println(smallerNumbersThanCurrent(nums));
    }

}
