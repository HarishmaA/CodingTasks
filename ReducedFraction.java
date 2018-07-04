import java.util.Arrays;

/*Implement a function that can sum two reduced fractions and produce a new one.

Example

For a = [3, 5] and b = [7, 5], the output should be
fractionSum(a, b) = [2, 1].

3 / 5 + 7 / 5 = 10 / 5 = 2 / 1, so the answer is [2, 1].
*/ 
public class ReducedFraction {
	private static int gcd(int a ,int b)
	{
	    return b==0?a:gcd(b,a%b);
	}

	private static int[] fractionSum(int[] a, int[] b) {
	    int[] c =new int[2];
	    int x=a[0]*b[1]+b[0]*a[1];
	    int y=a[1]*b[1];
	int d=gcd(x,y);
	    c[0]=x/d;
	    c[1]=y/d;
	    return c;
	    
	}
	public static void main(String[] args) {
		int[] a=new int[]{3,5};
		int[] b=new int[]{7,5};
		System.out.println(Arrays.toString(fractionSum(a,b)));
	}

}
