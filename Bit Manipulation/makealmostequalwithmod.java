
import java.util.*;

public class makealmostequalwithmod {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        long [] v = new long[n];
        for(int i =1; i<=61 ; i++){
            long num = (1L<<1);
            Set<Long> set = new HashSet<>();
            for(int j =0 ; j<n ;j++){
                set.add(v[j]%num);
            }
            if(set.size()==2){
                System.out.println(num);
                return;
            }
                sc.close();
        }
    
    }
}