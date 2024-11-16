package codevita;
import java.util.*;

public class HammingDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<String>> data = new ArrayList<>();
        String line = "";
        System.out.println("Enter the data:");

        while (sc.hasNextLine()) {
            line = sc.nextLine();
            if (line.equals("exit")) {
                break;
            }
            String[] values = line.split(" ");
            List<String> lineData = new ArrayList<>();
            for (String value : values) {
                lineData.add(value);
            }
            data.add(lineData);
        }

        String test = data.get(0).get(0);
        int testnum = Integer.parseInt(test);
        String line2 = data.get(1).get(0);
        String n1 = data.get(3).get(0);
        String n2 = data.get(3).get(1);
        int n1num = Integer.parseInt(n1);
        int n2num = Integer.parseInt(n2);

        int count01 = 0;
        int count10 = 0;
        int index = 0;

        while (index < line2.length() - 1) {
            if (line2.substring(index, index + 2).equals("01")) {
                count01++;
                index += 2;
            } else if (line2.substring(index, index + 2).equals("10")) {
                count10++;
                index += 2;
            } else {
                index++;
            }
        }

        int transformationCost = (count01 * n1num) + (count10 * n2num);
        System.out.println("The cost of transformed string: " + transformationCost);

        sc.close();
    }
}
