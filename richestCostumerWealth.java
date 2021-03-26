
public class richestCostumerWealth {
	public static int maximumWealth(int[][] accounts) {
		int n = accounts.length;
		int maxCount =0;
		for(int i = 0; i<n; i++) {
			int count =0;
			for(int j = 0; j < accounts[i].length; j++){
				count += accounts[i][j];
			}
			if(count > maxCount) {
				maxCount = count;
			}
		}
		return maxCount;
	}
	
	public static void main(String[] args) {
		int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
		System.out.println(maximumWealth(accounts)); 
	}
}
