
public class StairCase {

	public static void printStairCase(int n){
		String c = "#";
		String k= "";
		for(int i=0; i<n; i++){
			int j=i+1;
			if((n-j)>0)
			System.out.printf("%"+(n-j)+"s", k);
			for(;j>0;j--){
				System.out.printf("%s", c);
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args){
		printStairCase(6);
	}
}
