/*Given an NxN 2d array and N size 1d array

*Task is to find the sum of the diagonal of this square matrix and max element of the N sized array.

*Note: algorithm should run in O(N) time
*/
public class OneDimensionalAndTwoDimensionalArrays {
	public static void main (String[] args) throws java.lang.Exception
	{   int sum=0;
	    int max=Integer.MIN_VALUE;
		int[][] a=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int[] b=new int[]{1,2,3};
		int n= b.length;
		for(int i=0;i<n;i++)
		{
			sum+=a[i][i];
			if(b[i]>max)
			max=b[i];
		}
		System.out.println(sum+" "+max);
		
		}
}
