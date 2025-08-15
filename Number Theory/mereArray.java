import java.util.*;


public class mereArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int v [] = new int [n];
            for(int i = 0 ; i < n ; i++){
                v[i] = sc.nextInt();
            }

            int minI = Arrays.stream(v).min().getAsInt();

            List<Integer> divisible = new ArrayList<>();
            for(int num : v){
                if(num % minI==0){
                    divisible.add(num);
                }
            }

            Collections.sort(divisible);

            int idx =0;
            for(int i = 0 ; i< n ; i++){
                if(v[i]%minI==0){
                    v[i] = divisible.get(idx++);
                }
            }

            for(int i =1 ; i < n ; i++){
                if(v[i]<v[i-1]){
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        }
    }
}
