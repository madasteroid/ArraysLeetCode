import java.util.Arrays;

public class runningSumOf1DArray {
	public static int[] runningSum(int[] nums) {
		int n = nums.length;
		for(int i =1; i<n; i++) {
				nums[i] = nums[i]+ nums[i-1];
			}
		
		return nums;
	}
	
	public static void main(String[] args) {
		int []b = numbers();
		System.out.println(Arrays.toString(runningSum(b)));
	}
	
	public static int[] numbers() {
		int[] a = {1,3,5,7,9};
		return a;
	}
}
