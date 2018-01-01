import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PokiriStringOldLogic {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		//Using Linked HashMap to preserve the order of insertion
		//Generally HashMap doesn't preserve order of insertion, because 
		//it uses hashing and location of key element of a hash map is decided
		//based on hash value of key.
		Map<String, Integer> values = new LinkedHashMap<String, Integer>();
		
		//initializing value of first insertion to 1 occurrence
		final int INTIAL_VALUE = 1;
		for(char c : word.toCharArray()){
			
			//if there is no key matching in the hashmap for the value which we are passing
			//then it will return null
			if(null != values.get(String.valueOf(c))){
				values.put(String.valueOf(c), (values.get(String.valueOf(c))+1));
			}else{
				values.put(String.valueOf(c), INTIAL_VALUE);
			}
			
		}
		
		//Using Java8 lambda for looping over hashmap
		//and print values
		values.forEach((key, value) -> {
			if(value != 1){
				//for printing character along with repetitive count
				System.out.print(key+""+value);
			}else{
				//for printing only character if it is single instance
				System.out.print(key);
			}
		    
		});
		
	}
}
