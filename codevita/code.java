package codevita;
import java.util.*;

public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 7-segment representation for digits 0-9 (3x3 matrix)
        int[][][] digitSegments = new int[10][3][3];

        // Read the 3x9 matrix for digits 0-9
        for (int i = 0; i < 3; i++) {
            String row = sc.next();
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 3; k++) {
                    digitSegments[j][i][k] = row.charAt(j * 3 + k) - '0';
                }
            }
        }

        // Read the 3x3 matrix of the faulty input
        int[][] faultyInput = new int[3][3];
        for (int i = 0; i < 3; i++) {
            String row = sc.next();
            for (int j = 0; j < 3; j++) {
                faultyInput[i][j] = row.charAt(j) - '0';
            }
        }

        // Try to match the faulty input to the valid digits
        StringBuilder result = new StringBuilder();
        boolean isValid = true;

        // Check each digit of the faulty input
        for (int digitIndex = 0; digitIndex < 3; digitIndex++) {
            boolean matched = false;
            for (int validDigit = 0; validDigit < 10; validDigit++) {
                // Check if the faulty digit can be converted to a valid digit by toggling one segment
                if (canToggleToValidDigit(faultyInput, digitSegments[validDigit])) {
                    result.append(validDigit);
                    matched = true;
                    break;
                }
            }
            if (!matched) {
                isValid = false;
                break;
            }
        }

        // Output the result
        if (isValid) {
            System.out.println(result.toString());
        } else {
            System.out.println("Invalid");
        }
    }

    // Helper function to check if we can toggle a single light to make the input a valid digit
    private static boolean canToggleToValidDigit(int[][] faulty, int[][] valid) {
        int diffCount = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (faulty[i][j] != valid[i][j]) {
                    diffCount++;
                }
            }
        }
        return diffCount <= 1;  // Return true if only one or zero segments differ
    }
}
