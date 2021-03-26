import java.util.ArrayList;
import java.util.List;

public class kidsWithTheGreatestNumberOfCandies {
	public static List<Boolean> KidsWithCandies(int[] candies, int extraCandies){
		int n = candies.length;
		
		List<Boolean> result = new ArrayList<>();
		
		int greatestNumber =0;
		for(int i=0; i<n; i++) {
			 greatestNumber = Math.max(greatestNumber, candies[i]);
		}
		
		for(int i=0; i<n; i++) {
				result.add(candies[i]+extraCandies >= greatestNumber);	
			
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		int [] noOfCandies = {2,3,5,1,3};
		int extraCandies = 3;
		System.out.println(KidsWithCandies(noOfCandies, extraCandies));
		
	}

}
