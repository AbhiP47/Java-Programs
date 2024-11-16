package oopsjava.oopsjava;

public class gettersetter
{
  public static class Students
  {
   public String name;
   private int rno;
   public double percent;
   public int getRno()//getter function
   {
     return rno;
   }
   public void setRno(int roll)//setter function
   {
     rno = roll;
   }

  }
 
  public static void main(String[] args) 
  {
    Students s1 = new Students();
    s1.name = "raghav";
    s1.percent = 92.5;
    s1.setRno(76);
    System.out.println(s1.getRno());
  }
  
}
