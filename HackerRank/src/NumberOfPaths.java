
public class NumberOfPaths {
	public static int  numberOfPaths(int m, int n)
	{
	   // If either given row number is first or given column number is first
	   if (m == 1 || n == 1)
	        return 1;
	 
	   // If diagonal movements are allowed then the last addition
	   // is required.
	   double d = 10/-0;
	   return  numberOfPaths(m-1, n) + numberOfPaths(m, n-1);
	           //+ numberOfPaths(m-1,n-1);
	}
	
	public static void main(String[] args){
		int n = numberOfPaths(3,4);
		System.out.println(n);
	}
}
