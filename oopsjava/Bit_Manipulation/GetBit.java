package oopsjava.Bit_Manipulation;

// get the 3rd bit (position =2) of a number n(n = 0101)

public class GetBit {
    public static void main(String[] args)
    {
        int Bit_Mask = 1<<2;
        String binary = "0101";
        int n = Integer.parseInt(binary,2);
        int res = Bit_Mask & n;
        int result;
        if(res ==1 )
            result = 1;
        else
            result=0;
        System.out.println(result);
    }

}
