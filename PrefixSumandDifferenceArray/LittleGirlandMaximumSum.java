import java.util.*;
public class LittleGirlandMaximumSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        for(int i =0 ; i < n ; i++){
                arr[i] = sc.nextInt();
        }

        int diff [] = new int [n+1];

        int q= sc.nextInt();

            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }

   
           while(q-->0){
            int l = sc.nextInt();
            int r = sc.nextInt();

            diff[l-1] +=1;
            diff[r] -=1;
        }

        for(int i =1 ; i < n ; i++){
            diff[i] += diff[i-1];
        }


        Arrays.sort(arr);
        Arrays.sort(diff, 0,n);

        long ans =0;
        for(int i =0 ; i < n ; i++){
            ans += (long)arr[i] * diff[i];
        }
          System.out.println(ans);
    }
}
