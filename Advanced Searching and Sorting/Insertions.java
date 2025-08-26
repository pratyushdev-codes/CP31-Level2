import java.util.Scanner;

public class Insertions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();

            // first array
            int a [] = new int [n];

            for(int i = 0 ; i < n ; i++){
                a[i] = sc.nextInt();
            }

            // second array

            int b [] = new int [n];
            for(int i =0 ; i < n ; i++){
                b[i] = sc.nextInt();
            }

            int misMatchCount =0;
            for(int i =0 ; i < n ; i++){
                if(a[i]!=b[i]){
                    misMatchCount ++;
                }
            }
            System.out.println(misMatchCount-1);
        }
    }
}
