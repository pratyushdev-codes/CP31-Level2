import java.util.*;

public class DSnukePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int C = sc.nextInt(); // Prime subscription cost per day
        
        // Store service intervals and costs
        int[] start = new int[n];
        int[] end = new int[n];
        int[] cost = new int[n];
        
        Set<Integer> allDays = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
            cost[i] = sc.nextInt();
            
            // Collect all relevant days for coordinate compression
            allDays.add(start[i]);
            allDays.add(end[i]);
        }
        
        // Convert to sorted array for coordinate compression
        List<Integer> daysList = new ArrayList<>(allDays);
        Collections.sort(daysList);
        
        // Map original days to compressed indices
        Map<Integer, Integer> dayToIndex = new HashMap<>();
        for(int i = 0; i < daysList.size(); i++){
            dayToIndex.put(daysList.get(i), i);
        }
        
        // Calculate cost for each day using difference array technique
        int maxDay = daysList.get(daysList.size() - 1);
        int[] dailyCost = new int[maxDay + 2]; // +2 for safety margin
        
        // Apply difference array technique
        for(int i = 0; i < n; i++){
            dailyCost[start[i]] += cost[i];
            dailyCost[end[i] + 1] -= cost[i];
        }
        
        // Convert difference array to actual daily costs
        for(int i = 1; i <= maxDay; i++){
            dailyCost[i] += dailyCost[i - 1];
        }
        
        // Calculate minimum cost
        long totalCost = 0;
        for(int i = 1; i <= maxDay; i++){
            if(dailyCost[i] > 0){
                // Choose minimum between individual service costs and prime subscription
                totalCost += Math.min(dailyCost[i], C);
            }
        }
        
        System.out.println(totalCost);
        sc.close();
    }
}