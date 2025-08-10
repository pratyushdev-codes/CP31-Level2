import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> factors = new ArrayList<>();
        int n = sc.nextInt();
        for(int i =1 ; i*i<=n ; i++){
            if(n%i==0){
                factors.add(i);
            }
            if(i !=n/i){
                factors.add(n/i);
            }
        }
        for(int i =0 ; i< factors.size(); i++){
            System.out.println(factors.get(i));
        }
    }
}