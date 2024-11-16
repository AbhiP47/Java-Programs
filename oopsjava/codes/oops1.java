class Students
{
  int age;
  String name;
  int rollno;
  public void printInfo()
  {
    System.out.println(this.age);
    System.out.println(this.name);
    System.out.println(this.rollno);
  }

}
public class oops1 {
  public static void main(String []args)
  {
    Students s1 = new Students();
    s1.age = 21;
    s1.name = "aditya";
    s1.rollno = 34;
    Students s2 = new Students();
    s2.age = 22;
    s2.name = "abhi";
    s2.rollno = 45;
    s1.printInfo();
    s2.printInfo();
  }
  
}
