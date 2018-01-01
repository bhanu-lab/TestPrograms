import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BalancedStacks {

    public static void main(String[] args) {
        boolean isWritten = false;
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        Integer h1[] = new Integer[n1];
        int n1_len = 0, n2_len = 0, n3_len = 0;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();        
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
            //stack1.push(h1[h1_i]);
            n1_len = n1_len + h1[h1_i];
        }
        Integer h2[] = new Integer[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
            //stack2.push(h2[h2_i]);
            n2_len = n2_len + h2[h2_i];
        }
        Integer h3[] = new Integer[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
            //stack3.push(h3[h3_i]);
            n3_len = n3_len + h3[h3_i];            
        }
        List<Integer> l1 = Arrays.asList(h1);
        Collections.reverse(l1);
        List<Integer> l2 = Arrays.asList(h2);
        Collections.reverse(l2);
        List<Integer> l3 = Arrays.asList(h3);
        Collections.reverse(l3);   
        
        stack1.addAll(l1);
        stack2.addAll(l2);
        stack3.addAll(l3);
        
        while(n1_len != 0 && n2_len != 0 && n3_len != 0){
            System.out.println("n1 length : "+n1_len);
            System.out.println("n2 length : "+n2_len);
            System.out.println("n3 length : "+n3_len);
            if(n1_len == n2_len && n2_len == n3_len){
                System.out.println(n2_len);
                isWritten = true;
                break;
            } else {
                int maxSize = (n1_len >= n2_len) && (n1_len >= n3_len) ? 1 : 
                                        ((n2_len >= n1_len) && (n2_len >= n3_len)) ? 2 : 3;
                switch(maxSize){
                    case 1:
                        int element = stack1.pop();
                        n1_len = n1_len - element;
                        System.out.println("in case 1 "+element);
                        break;
                    case 2:
                        int element2 = stack2.pop();
                        n2_len = n2_len - element2;
                        System.out.println("in case 2 "+element2);
                        break;
                    case 3:
                        int element3 = stack3.pop();
                        n3_len = n3_len - element3;
                        System.out.println("in case 3 "+element3);
                        break;
                }
            }
        }
        if(!isWritten){
        	System.out.println("Printing out of loop");
            System.out.println(0);
        }
    }
    
    public static void maxNumber(int a, int b, int c){
    }
}


