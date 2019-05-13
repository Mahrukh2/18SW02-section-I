class Static
{
 int rollno;
 String name;
 static String Department_Name="Software";
 }
 class Lab6Task6{
 public static void main(String args[]){
  Static s=new Static();
  s.rollno=02;
  s.name="Alia";
  System.out.println(s.rollno);
  System.out.println(s.name);
  System.out.println(Static.Department_Name);
  Static s1=new Static();
  s1.rollno=70;
  s1.name="Alina";
  System.out.println(s1.rollno);
  System.out.println(s1.name);
  System.out.println(Static.Department_Name);
  }
 }
