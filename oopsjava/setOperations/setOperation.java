package oopsjava.setOperations;
import java.util.*;
public class setOperation {

    public static void main(String[] args)
    {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4,5,6,7,8));

        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);
        // union operation
        System.out.println("the result of union operation is:" +result);
        result.clear();

        // intersection operation
        result.addAll(set1);
        result.retainAll(set2);
        System.out.println("the result of intersection is:" +result);
        result.clear();

        // difference (set1-set2)
        result.addAll(set1);
        result.removeAll(set2);
        System.out.println("the result of difference operation is:" +result);
        result.clear();

        // symmetric difference ( set1 ^ set2 )
        result.addAll(set2);
        Set<Integer> temp = new HashSet<>(set1);
        temp.retainAll(set2);
        result.removeAll(temp);
        System.out.println("the result of symmetric difference is:" +result);

        // check subset (set1 <= set2)
        System.out.println(set2.containsAll(set1));

    }

}
