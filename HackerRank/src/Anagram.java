import java.util.Arrays;

public class Anagram {

	
	static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] aArr = a.toCharArray(); 
        char[] bArr = b.toCharArray();
        Arrays.sort(aArr);
        Arrays.sort(bArr);
System.out.println(new String(aArr)+" "+new String(bArr));
        if(new String(aArr).toUpperCase().equalsIgnoreCase(new String(bArr).toUpperCase())){
            return true;
        }else{
            return false;
        }
    }
	
	public static void main(String[] args){
		if(isAnagram("Hello", "hello")){
			System.out.println("Anagrams");
		}else{
			System.out.println("Not Anagram");
		}
	}
}
