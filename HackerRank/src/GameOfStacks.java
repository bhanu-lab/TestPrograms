import java.util.Scanner;

public class GameOfStacks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        
        for(int a0 = 0; a0 < g; a0++){
            boolean isWritten = false;
            int a_top = 0;
            int b_top = 0;
            int moves = 0;
            int count = 0;
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            int[] b = new int[m];
            for(int b_i=0; b_i < m; b_i++){
                b[b_i] = in.nextInt();
            }
            while((a_top < n) && (b_top < m)){
                //System.out.println("A top "+a_top+" B top"+b_top);
                int value = 0;
                if(a[a_top] >= b[b_top]){
                    value = b[b_top];
                    b_top++;
                }else{
                    value = a[a_top];
                    a_top++;
                }
                count = count + value;
                //System.out.println("count "+count);
                if( count < x){
                    //System.out.println("Incrementing moves");
                    moves++;
                }else{
                    System.out.println(moves);
                    isWritten = true;
                    break;
                }
            }
            if(!isWritten){
                System.out.println(moves);
            }
        }
    }
}

