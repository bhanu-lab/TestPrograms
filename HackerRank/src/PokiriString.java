import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PokiriString {


	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		//ArrayList to store values and preserves order of insertion
		List<String> chars = new ArrayList<String>();
		
		//Storing each character in a string as an individual element into a list
		for(char c : word.toCharArray()){
			chars.add(String.valueOf(c));
		}
		
		//Using StringBuilder
		String outputString = "";

		int count = 0;
		for(int i =0; i<chars.size(); i++){
			if(i==0){
				outputString=outputString.concat(chars.get(0));
			}else if(chars.get(i).equals(chars.get(i-1))){
				count++;
			}else if(!chars.get(i).equals(chars.get(i-1))){
				if(count > 1){
					outputString=outputString.concat(String.valueOf(count));
				}
				outputString=outputString.concat(chars.get(i));
				count = 1;
			}
		}
		if(count > 1){
			outputString=outputString.concat(String.valueOf(count));
		}
		System.out.println(outputString);
	}

}
