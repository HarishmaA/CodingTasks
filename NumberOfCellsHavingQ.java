/*
 * A matrix is constructed of size n*n. such that Mi,j= i+j.
Count the number of cells having value q.

Assume, 1 based indexing.

Input:
The first line contains an integerT , the number of testcases.
Then each test case contains an integer n- size of the matrix , q- whose count you need to tell.
 

Output:
For every testcase, Output the count of q.
 

Constraints:
1<=n<=100
2<=q<=2*n

Example:
Input:
2
4 7
5 4

Output:
6
3


Explanation:
1st testcase- Matrix becomes
2 3 4 5 
3 4 5 6 
4 5 6 7 
5 6 7 8

The count of 7 is 2

2nd testcase-Matrix becomes
2 3 4 5 6 
3 4 5 6 7 
4 5 6 7 8 
5 6 7 8 9 
6 7 8 9 10 
The count of 4 is 3
 */
public class NumberOfCellsHavingQ {
	
	private static int numberOfCellsHavingQ(int n, int q)
	{

			if(q<=2*n)
			{
				if(q<=n)
					return q-1;
				else
					return 2*n-q+1;
			}
		
		return 0;
	}
	public static void main(String[] args) {
		int n=4,q=7;
		System.out.println(numberOfCellsHavingQ(n, q));
		int n1=5,q1=4;
		System.out.println(numberOfCellsHavingQ(n1, q1));
	}

}
