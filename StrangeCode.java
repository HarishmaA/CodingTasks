/*
 * You have found a machine which, when fed with two numbers s and e, produces a strange code consisting of the letters a and b. The machine seems to be using the following algorithm.

Check if s is less than e - 1. If so, continue to step 2. If not, exit.
Increment s by 1
Decrement e by 1
If this is the first letter you're producing, produce a. Otherwise produce a letter different from the one you last produced (only a and b may be produced)
go to step 1.
You are to write a function that simulates the workings of the machine.

Example

For s = 4 and e = 8, the output should be
strangeCode(s, e) = "ab".
 */
public class StrangeCode {
	private static String strangeCode(int s, int e) {
		String str="";
		    int c=0;
		    while(s<e-1)
		    {
		     s++;
		     e--;
		     if(c%2==0)
		         str+="a";
		     else
		         str+="b";
		     c++;
		    }
		    return str;
		}
	public static void main(String[] args) {
	int s=4,e=10;
	System.out.println(strangeCode(s,e));

	}

}
