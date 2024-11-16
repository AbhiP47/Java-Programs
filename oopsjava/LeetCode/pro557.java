package oopsjava.LeetCode;

public class pro557 {
        public String reverseWords(String s) {
            s = s+" ";
            String subs = "";
            String rev = " ";
            String result = "";
            for(int i=0 ; i<s.length() ; i++)
            {
                for(int j=i+1 ; j<s.length() ; j++)
                {
                   if(s.charAt(i) == ' ' && s.charAt(j) == ' ')
                   {
                       subs = s.substring(i+1,j);
                      rev = new StringBuilder(subs).reverse().toString();
                      result = result.concat(rev+" ");
                   }
                }
            }
            return result;
        }

}
