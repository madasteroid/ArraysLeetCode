package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class decompressRLElist {
	public static String decompressRLElist1(int[] nums) {
		int size =0;
		for(int i=0; i<nums.length; i+=2) {
			size = size + nums[i];
		}
		int[] res = new int[size];
		
		for(int i=1, k=0; i<nums.length; i+=2) {
			for(int j=0; j<nums[i-1]; j++) {
				res[k++] = nums[i];
			}
		}
		return Arrays.toString(res);
		
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6};
		System.out.println(decompressRLElist1(nums));
		
	}
}
