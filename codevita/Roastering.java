package codevita;
import java.util.*;
public class Roastering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<List<Integer>> friendships = new ArrayList<>();
        for(int i=0 ; i<N ;i++)
        {
            friendships.add(new ArrayList<>());
        }
        for(int i=0; i<M; i++)
        {
           int emp1 = sc.nextInt();
           int emp2 = sc.nextInt();
           /*
           friendships = [
    [1],   // Employee 0's friends: [1]
    [0, 2],// Employee 1's friends: [0, 2]
    [1, 3],// Employee 2's friends: [1, 3]
    [2, 4],// Employee 3's friends: [2, 4]
    [3]    // Employee 4's friends: [3]
                                        ]

            */
           friendships.get(emp1).add(emp2);
           friendships.get(emp2).add(emp1);
        }
        int k = sc.nextInt();
        sc.close();
        boolean[] inOffice = new boolean[N];
        Arrays.fill(inOffice,true);
        int totalRostering = N;
        int dayCount = 1;
        while(totalRostering < k)
        {
            boolean[] nextDay = new boolean[N];
            for(int i=0; i<N; i++)
            {
                int friendsInOffice = 0;
                for (int friend : friendships.get(i)) {
                    if (inOffice[friend]) {
                        friendsInOffice++;
                    }
                }
                if (inOffice[i] && friendsInOffice == 3) {
                    nextDay[i] = true;
                }
                else if (!inOffice[i] && friendsInOffice < 3) {
                    nextDay[i] = true;
                }
                else {
                    nextDay[i] = false;
                }
                if(nextDay[i])
                {
                    totalRostering++;
                }

            }
            inOffice = Arrays.copyOf(nextDay,N);
            dayCount++;
        }
        System.out.println(dayCount);

    }
}
/*
Input

5 7
1 4
0 4
0 1
3 2
3 4
2 0
1 3
15

Output

5


 */