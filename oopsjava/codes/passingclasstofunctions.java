package oopsjava.codes;

public class passingclasstofunctions
{
  public class Students
  {

    Students s1 = new Students();
    String name;
    int rno;
    double percent;
  }
  public static void fun(Students x)
  {
    System.out.println(x.name);
    return;
  }
  public static void change(Students s)
  {
    s.name = "rohan";
  }

  
}
