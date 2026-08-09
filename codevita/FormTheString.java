package codevita;
import java.util.*;

public class FormTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of substrings
        int N = sc.nextInt();
        sc.nextLine(); // Consume the newline after the integer

        // List to store substrings with their costs
        List<String> substrings = new ArrayList<>();
        List<Integer> costs = new ArrayList<>();

        // Read substrings and their costs
        for (int i = 0; i < N; i++) {
            String substring = sc.next();
            int cost = sc.nextInt();
            substrings.add(substring);
            costs.add(cost);
        }

        // Read the main string
        sc.nextLine(); // Consume the newline after the integer
        String mainString = sc.nextLine();

        // Initialize DP array to store the minimum cost to form the first i characters
        int len = mainString.length();
        int[] dp = new int[len + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; // Cost to form an empty string is 0

        // Process each position in the main string
        for (int i = 0; i < len; i++) {
            // Skip if current position is not reachable (no valid cost found so far)
            if (dp[i] == Integer.MAX_VALUE) continue;

            // Try to form the next part of the string using each substring
            for (int j = 0; j < N; j++) {
                String substring = substrings.get(j);
                int cost = costs.get(j);

                // Check if substring can be placed at position i
                if (i + substring.length() <= len && mainString.substring(i, i + substring.length()).equals(substring)) {
                    dp[i + substring.length()] = Math.min(dp[i + substring.length()], dp[i] + cost);
                }
            }
        }

        // The result is the minimum cost to form the entire string
        if (dp[len] == Integer.MAX_VALUE) {
            System.out.println("Impossible");
        } else {
            System.out.println(dp[len]);
        }

        sc.close();
    }
}
