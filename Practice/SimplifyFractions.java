package Practice;
import java.util.*;
public class SimplifyFractions {
    public static class Fraction{
        int num;
        int den;
        public Fraction(int num, int den)
        {
            if(den ==0 ) throw new IllegalArgumentException("denominator cannot be zero");
            this.num = num;
            this.den = den;
        }
        public static int gcd(int num , int den)
        {
            if(den==0)
                return num;
            return gcd(den, num%den);
        }
        public void simplify()
        {
            int g = gcd(this.num, this.den);
            this.num /= g;
            this.den /= g;
        }

        public void add(Fraction f)
        {
             this.num = (this.num * f.den)+(f.num * this.den);
             this.den = this.den * f.den;

        }

        @Override
        public String toString()
        {
            return num+"/"+den;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of fractions to be added");
        int n = sc.nextInt();
        Fraction result = null;
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the fraction "+(i+1));
            System.out.println("Enter the numerator for fraction "+(i+1));
            int num = sc.nextInt();
            System.out.println("Enter the denominator for fraction "+(i+1));
            int den = sc.nextInt();
            try {
                Fraction f = new Fraction(num, den);
                if(result == null)
                    result = f;
                else
                    result.add(f);
                result.simplify();
            } catch(IllegalArgumentException e)
            {
                System.out.println("Invalid input" + e.getMessage());
                i--;
                System.out.println("enter the input again");
            }
        }
        System.out.println(result);
    }
}
