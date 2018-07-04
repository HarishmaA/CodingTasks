/*Given the first two elements of an arithmetic progression, find its nth element.

Example

For element1 = 3, element2 = 2 and n = 4, the output should be
arithmeticProgression(element1, element2, n) = 0.

The difference between two consecutive elements of the arithmetic progression is element2 - element1 = -1. Thus, the third element of the progression is 1, and the fourth one is 0, which is the answer.
*/
public class NthElementInAP {
		private static int arithmeticProgression(int element1, int element2, int n) {
		return element1+(n-1)*(element2-element1);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int element1=3,element2=2,n=4;
     System.out.println(arithmeticProgression(element1,element2,n));
	}

}
