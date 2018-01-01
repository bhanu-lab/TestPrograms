import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PokiriString {


	public static void main(String[] args){
		//for reading input from console
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		scan.close();
		
		//ArrayList to store values and preserves order of insertion
		List<String> chars = new ArrayList<String>();
		
		//Storing each character in a string as an individual element into a list
		//for better control over comparison and insertion
		for(char c : word.toCharArray()){
			chars.add(String.valueOf(c));
		}
		
		//initializing output string
		String outputString = "";

		int count = 0;
		for(int i =0; i<chars.size(); i++){
			
			//Satisfies initial value condition and makes count as 1
			if(i==0){
				outputString=outputString.concat(chars.get(0));
				count = 1;
			}
			//from second element in the list it will check whether previous element is same
			//as the current element increases the count 
			else if(chars.get(i).equals(chars.get(i-1))){
				count++;
			}
			//from second element if current element is not equal to previous element
			//then it concatenate and make current element count as 1
			else if(!chars.get(i).equals(chars.get(i-1))){
				if(count > 1){
					outputString=outputString.concat(String.valueOf(count));
				}
				outputString=outputString.concat(chars.get(i));
				count = 1;
			}
		}
		
		//after last element iteration if count is present as more than 1 then attaching it to the
		//output string 
		if(count > 1){
			outputString=outputString.concat(String.valueOf(count));
		}
		System.out.println(outputString);
	}

}
