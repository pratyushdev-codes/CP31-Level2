import java.util.Scanner;

public class ReverseBinaryStrings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s= sc.next();
            int total =0;
            for(int i =0 ; i < n -1 ; i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    total++;
                }
            }
            System.out.println((total+1)/2);
        }
    }
}
