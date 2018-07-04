/*Given n  is odd 
 * Print  patterns 
 * if n=5
 *      *
 *      ***
 *      *****
 *      ***
 *      *
 *      
 * if n=7
 *    
 *      *
 *      ***
 *      *****
 *      *******
 *      *****
 *      ***
 *      *
 *
 */
public class Pattern {

	public static void main(String[] args) {
     int n=5,s=1;
     //to print the upper part
     for(int rows=1;rows<=(n/2)+1;rows++)
     {
    	 for(int j=1;j<=s;j++)
    	 {
    		 System.out.print("* ");
    		 
    	 }
    	 s=s+2;
    	 System.out.println();
     }
   //to print the lower part
     s=n-2;
     for(int rows=1;rows<=(n/2);rows++)
     {
    	 for(int j=1;j<=s;j++)
    	 {
    		 System.out.print("* ");
    		 
    	 }
    	 s=s-2;
    	 System.out.println();
     }

	}

}
