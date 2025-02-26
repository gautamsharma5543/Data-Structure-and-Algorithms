package Array;

public class BuyAndSellStock {
	
	public static int buy(int[] price) {
		
		int buyprice=price[0];
		int maxprofit=0;
		for(int i=0;i<price.length;i++) {
			
			if(buyprice>price[i]) {
				buyprice=price[i];
			}
			else {
				int currentprofit=price[i]-buyprice;
				 maxprofit =Math.max(maxprofit,currentprofit);
			}
		}
		return maxprofit;	
	}
	
	
public static void main(String[] args) {
	int arr[]= {7,1,5,3,6,4};
	System.out.println( buy(arr));
	
}

}
