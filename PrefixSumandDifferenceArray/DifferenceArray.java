import java.util.*;
public class DifferenceArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr [] = new int [n];
        for(int i =0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }


        int diff [] = new int [n+1];
        int q = sc.nextInt();
        while(q-->0){
            int l = sc.nextInt();
            int r =sc.nextInt();
            int x = sc.nextInt();
            diff[l] += x;
            diff[r+1]-= x;
        }

        // prefix sum for difference Array:-
        for(int i = 1 ; i < n ; i++){
            diff[i]  += diff[i-1] ;
        }
        for(int i =0 ; i < n ; i++){
            System.out.println(arr[i] + diff[i]);
        }

    }
}
