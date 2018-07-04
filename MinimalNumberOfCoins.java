/*
 * For coins = [1, 2, 10] and price = 28, the output should be
minimalNumberOfCoins(coins, price) = 6.

You have to use 10 twice, and 2 four times.
 */
public class MinimalNumberOfCoins {
	private static int minimalNumberOfCoins(int[] coins, int price) {

		  int result = 0;

		  for (int i = coins.length - 1; i >= 0; i--) {
		    result += price / coins[i];
		    price %= coins[i];
		  }

		  if (price != 0) {
		    return  result + 1;
		  }
		  return result;
		}
	public static void main(String[] args) {
		int[] coins=new int[] {1,2,10};
		int price=28;
		System.out.println(minimalNumberOfCoins(coins,price));

	}

}
