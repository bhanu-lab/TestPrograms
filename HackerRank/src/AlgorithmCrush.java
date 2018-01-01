import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlgorithmCrush {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long arr[] = new long[n];
        long max = Integer.MIN_VALUE;
        Arrays.fill(arr,0);
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            while(a<=b){
                arr[a-1] = arr[a-1]+k;
                if(arr[a-1] > max){
                    max = arr[a-1];
                }
                a++;
            } 
            /*for(int s=0; s<arr.length; s++){
                System.out.print(arr[s]+" ");
            }
            System.out.println();*/
        }
        System.out.println(max);
        in.close();
    }
}
//2_14_74_83_639
//7_54_25_39_201
