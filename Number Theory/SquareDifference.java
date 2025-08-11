import java.util.*;
public class SquareDifference {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){

   
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a-b!=1){
            System.out.println("NO");
            return;
        }

        int num = a+b;

        int count = 0;
        for(int i =2 ; i *i<= num ; i++){
            if(num%i==0){
                count++;
                while(num%i==0){
                    num/=i;
                }
            }
        }
        if(num>1){
            count++;
        }

        if(count==1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }
}
     }