
import java.util.*;
public class KuriyamaMiraiStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // given input array
        int n = sc.nextInt();
        int v[] = new int [n];

        // prefix arrays:-
        int firstQ [] = new int [n+1];
        firstQ[0]=0;
        int secondQ [] = new int [n+1];
        secondQ[0]=0;


    
        
        for(int i =0 ; i < n ; i++){
            v[i] = sc.nextInt();
            firstQ[i+1] = firstQ[i]+ v[i]; // prefix array for type 1 
        }

        Arrays.sort(v);

        // prefix array for type 2

        for(int i =0; i < n ;i++){
            secondQ[i+1] = secondQ[i] + v[i];
        }




        int m = sc.nextInt();
        while(m-->0){
            int t = sc.nextInt();
            if(t==1){
                int l = sc.nextInt();
                int r = sc.nextInt();
                System.out.println(firstQ[r] - firstQ[l-1]);
            }
            else{
                int l = sc.nextInt();
                int r = sc.nextInt();
                System.out.println(secondQ[r] - secondQ[l-1]);
            }
        }   
        }
        
    }

