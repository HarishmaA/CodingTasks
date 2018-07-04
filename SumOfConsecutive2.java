/*
 * Find the number of ways to express n as sum of some (at least two) consecutive positive integers.

Example

For n = 9, the output should be
isSumOfConsecutive2(n) = 2.

There are two ways to represent n = 9: 2 + 3 + 4 = 9 and 4 + 5 = 9.

For n = 8, the output should be
isSumOfConsecutive2(n) = 0.

There are no ways to represent n = 8.
 */
public class SumOfConsecutive2 {
	private static int isSumOfConsecutive2(int n) {
	    int count = 0;
	    for(int i = 1; i < n; i ++){
	        int sum = 0;
	        int j = i;
	        while(j < n){
	            sum += j;
	            j++;
	            if(sum == n){
	                count ++;
	            }
	        }
	    }
	    return count;
	}
	public static void main(String[] args) {
		int n1=20;
	    System.out.println(isSumOfConsecutive2(n1));
	    int n2=8;
	    System.out.println(isSumOfConsecutive2(n2));
	}

}
