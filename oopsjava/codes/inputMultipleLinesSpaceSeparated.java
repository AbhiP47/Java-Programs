package oopsjava.codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inputMultipleLinesSpaceSeparated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<String>> data = new ArrayList<>();
        String line = "";
        System.out.println("enter the data");

        while(sc.hasNextLine())
        {
            line = sc.nextLine();
            if(line.equals("exit"))
            {
                break;
            }
            String[] values = line.split(" ");
            List<String> lineData = new ArrayList<>();
            for(String value : values)
            {
                lineData.add(value);
            }
            data.add(lineData);
        }
        for(List<String> lineData:data) {
            System.out.println(String.join(" ",lineData));
        }
        sc.close();
    }
}
