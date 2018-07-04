/*
 * Given array of integers, check if it represents either a strictly increasing or a strictly decreasing sequence.

Example

For sequence = [1, 4, 5, 7, 9], the output should be
isMonotonous(sequence) = true;
For sequence = [0], the output should be
isMonotonous(sequence) = true;
For sequence = [3, 3], the output should be
isMonotonous(sequence) = false.
 */
public class Monotonous {
	public static boolean strictly(int[] a)
	{
	if(a.length==1)
		return true;
	int m=a[1]-a[0];
	for(int i=1;i<a.length;i++)
	{
		if(m>0)
		{
			if(a[i]-a[i-1]<=0)return false;
		}
		else
		{
			
				if(a[i]-a[i-1]>=0)return false;
		}
	}
	return true;
	}
	public static void main(String[] args) {
	System.out.println(strictly(new int[] {1,4,5,7,9}));	
	System.out.println(strictly(new int[] {9,7,5,4}));
	System.out.println(strictly(new int[] {3,3}));
	System.out.println(strictly(new int[] {0}));
	}

}
