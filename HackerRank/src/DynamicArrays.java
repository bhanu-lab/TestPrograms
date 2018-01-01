import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DynamicArrays {

    public static void main(String[] args) { 
    	Scanner sc = new Scanner(System.in);
        int seq;
        int size;
        int n = sc.nextInt();
        int q = sc.nextInt();
        int lastAnswer = 0;
        int[][] al = new int[n][];
        for(int j=0;j<n;j++){
            al[j]=new int[0];
        }
        for(int i=0;i<q;i++){
            int query = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(query==1){
                seq = ((x^lastAnswer)%n);
               /// al[seq].add(y);
            }
            else if(query==2){
                seq = ((x^lastAnswer)%n);
              //  size = al[seq].size();
              //  lastAnswer = al[seq].get(y%size);
                System.out.println(lastAnswer);
            }

        }
    sc.close();
    }
    public static int[] addToArray(int[] arr, int arrLen, int y){
        int[] temp = null;
        if(arr.length != 0){
            int size = arr.length + 1;
            temp = Arrays.copyOf(arr, size);
        }else{
            temp = new int[++arrLen];
        }
        temp[temp.length - 1] = y;
        arr = Arrays.copyOf(temp, temp.length);
        return arr;
    }
}