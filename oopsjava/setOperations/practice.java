package oopsjava.setOperations;
import java.util.*;
public class practice {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            sc.nextLine();  // <-- This consumes the leftover newline

            Set<String> set = new TreeSet<>();

            for(int i = 0; i < n; i++) {
                set.add(sc.nextLine());
            }

            for(String element : set) {
                System.out.print(element + " ");
            }
            System.out.println(set.size());

            sc.close();
        }
    }


