import java.util.ArrayList;
import java.util.List;

public class ProblemIterations1 {
	public void callMethod(){
		int a = 0;
	    int b = 2;
	    int n = 10;
	    List<Integer> intList = new ArrayList<Integer>();
	    
	    for(int j=0; j<n; j++){
	        int m = 0;
	        int sum =0;
	        while(m<=j){
	            sum = (int) (sum+((Math.pow(2, m))*b));
	            System.out.println(sum+" "+Math.pow(2, m)+" "+m+" "+j);
	            m++;
	        }
	        System.out.println("end");
	        intList.add(a+sum);
	    }
	    for(int lnum: intList){
	        //System.out.print(lnum+" ");
	    }
	}
	public static void main(String[] args){
		ProblemIterations1 pi = new ProblemIterations1();
		pi.callMethod();
	}
}
