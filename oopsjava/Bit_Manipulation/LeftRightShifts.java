package oopsjava.Bit_Manipulation;

public class LeftRightShifts {

        public static void main(String args[])
        {
            int n = 3;
            int leftShift = n<<1;
            String num1 = Integer.toBinaryString(n);
            String result1 = Integer.toBinaryString(leftShift);
            System.out.println(num1);
            System.out.println(result1);
            int rightShift = n>>1;
            String num2 = Integer.toBinaryString(n);
            String result2 = Integer.toBinaryString(rightShift);
            System.out.println(num2);
            System.out.println(result2);
        }
    }


