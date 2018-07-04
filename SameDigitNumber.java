/*
 * Given an integer, check that all the digits in the number are the same.

Example

For n = 1111, the output should be
sameDigitNumber(n) = true;
For n = 1122, the output should be
sameDigitNumber(n) = false.
 */
public class SameDigitNumber {
	private static boolean sameDigitNumber(int n) {
		int digit = n%10;
		    while(n!=0)
		    {
		    if(n%10==digit)
		        n/=10;
		    else
		        return false;
		    }
		    return true;
		}
	public static void main(String[] args) {
		int n=1111;
		System.out.println(sameDigitNumber(n));
		int m=1122;
		System.out.println(sameDigitNumber(m));
	}	

}
