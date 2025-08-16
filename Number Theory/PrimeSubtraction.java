import java.util.Scanner;

public class PrimeSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x= sc.nextInt();
            int y = sc.nextInt();
            if((x-y)==1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
