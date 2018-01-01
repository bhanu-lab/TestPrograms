import java.util.Scanner;
import java.util.Stack;

public class EqualStacks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        int n1_len = 0, n2_len = 0, n3_len = 0;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();        
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
            stack1.push(h1_i);
            n1_len = n1_len + h1[h1_i];
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
            stack2.push(h2_i);
            n2_len = n2_len + h2[h2_i];
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
            stack3.push(h3_i);
            n3_len = n3_len + h3[h3_i];            
        }
        
        while(!stack1.empty() && !stack2.empty() && !stack3.empty()){
            if(n1_len == n2_len && n2_len == n3_len){
                System.out.println(n1_len);
                break;
            }else {
                int maxSize = (n1_len > n2_len) && (n1_len > n3_len) ? 1 : 
                                        ((n2_len > n1_len) && (n2_len > n3_len)) ? 2 : 3;
                switch(maxSize){
                    case 1:
                        int element = stack1.pop();
                        n1_len = n1_len - element;
                        break;
                    case 2:
                        int element2 = stack2.pop();
                        n2_len = n2_len - element2;
                        break;
                    case 3:
                        int element3 = stack3.pop();
                        n3_len = n3_len - element3;
                        break;
                }
            }
        }
    }
}

