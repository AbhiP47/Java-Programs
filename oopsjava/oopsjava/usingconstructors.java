package oopsjava.oopsjava;
public class usingconstructors
{
  public static class Student
  {
    String name;
    int roll;
    double percent;
    public Student()  //default constructor
    {
      this.name = "default";
      this.roll = 0;
      this.percent = 0.0;
    }
    public Student(String name , int roll , double percent) //parameterized constructor
    {
      this.name = name;
      this.roll = roll;
      this.percent = percent;
    }

  }
  public static void main(String[] args) 
  {
    Student s1 = new Student();
    s1.percent = 88.6;
    s1.name = "raghav";
    s1.roll = 76;
    System.out.println(s1.name);
    System.out.println(s1.percent);
    System.out.println(s1.roll);

    Student s2 = new Student("rahul",67,98.3);
    System.out.println(s2.name);
    System.out.println(s2.roll);
    System.out.println(s2.percent);
  }

  
}