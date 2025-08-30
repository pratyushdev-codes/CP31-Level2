import java.util.Scanner;

public class TowerofHanoi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // main - base function
    }    public int towerOfHanoi(int n, int from, int to, int aux) {
        
        if(n<=1){
            return n;
        }

        int moves = towerOfHanoi(n-1, from , aux , to);
        moves++;
        moves+= towerOfHanoi(n-1, aux , to, from);
        return moves;

        
 


    }
}
