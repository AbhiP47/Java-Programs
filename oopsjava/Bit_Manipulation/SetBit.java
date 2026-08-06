package oopsjava.Bit_Manipulation;

// set the 2nd bir (position=1) of a number n(n=0101)

public class SetBit {
    public static void main(String[] args)
    {
        int n = Integer.parseInt("0101",2);
        int Bit_mask = 1<<1;
        int result = n | Bit_mask;
        System.out.println("0101");
        System.out.println(Integer.toBinaryString(result));
    }
}
