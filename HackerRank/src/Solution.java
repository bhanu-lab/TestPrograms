import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
    
    public static boolean isBalanced(String exp){
        List<Character> braces = new ArrayList<>();
        char[] bracesArr = exp.toCharArray();
        Stack<Character> bracesStack = new Stack<>();
        for(Character brace: bracesArr){
        	if(!bracesStack.empty()){
        		Character top = bracesStack.peek();
        		if((top == '{' && brace == '}')
        				|| (top == '(' && brace == ')')
        				|| (top == '[' && brace == ']')){
        			bracesStack.pop();
        		}else{
        			bracesStack.push(brace);
        		}
        	}else{
        		bracesStack.push(brace);
        	}
        }
        if(bracesStack.empty()){
        	return true;
        }else {
        	return false;
        }
    }
}
