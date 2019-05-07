class StudentClass{
int age;
String name,section,sem, rollno,dep;

void setData(int a, String n , String s , String se, String r ,String d)
 {
 name=n;
 dep=d;
 sem=se;
 section=s;
 rollno=r;
 age=a;
 }
 void getData()
 {
 System.out.println("Student Data :- ");
 System.out.println(" Name : " + name);
 System.out.println(" Department : " + dep);
 System.out.println(" Semester : " + sem);
 System.out.println(" Section : " + section);
 System.out.println(" Roll Number : " + rollno);
 System.out.println(" Age  : " + age);
 }
 }
 public class Task4Student{
 public static void main(String args[]){
 StudentClass std=new StudentClass();
 std.setData(19,"Alia","II","Second","18SW02","Software Engineering Department");
 std.getData();
 }
 }
