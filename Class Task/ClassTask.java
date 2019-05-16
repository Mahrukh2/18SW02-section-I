class Person{
 String n;
 String qual;
 public void showMsg(){
  this.n="Maha";
  System.out.println("Name :  " + n);
  }
 }
 class Student extends Person{
  int age;
  String rolno;
  public void showMsg(){
  this.rolno="18SW02";
  this.age=18;
  System.out.println("Roll No. :  " + rolno);
  System.out.println("Age :  " + age);
  }
 }
 class Employee extends Person{
 int salary;
 public void showMsg(){
 this.salary=14000;
 System.out.println("Salary :  " + salary);
 }
}
class Undergraduate extends Student{
String deg;
public void showMsg(){
 this.deg="Null";
 System.out.println("Degree : " + deg);
 }
}
class Graduate extends Student{
 String deg;
 public void showMsg(){
  this.deg="BE";
  System.out.println("Degree  :  " + deg);
  }
}
class Faculty extends Employee{
String ui;
public void showMsg(){
this.ui="18Sw0993@gmaill.com";
System.out.println("User ID   :  " + ui);
}
}
class Master extends Graduate{
 String dep;
 public void showMsg(){
  this.dep="Software Engineering";
  System.out.println("Department  :  " + dep);
  }
}
class Doctoral extends Graduate{
 String phd;
 public void showMsg(){
  this.phd="Programming";
  System.out.println("PhD : " + phd);
  }
 }
 class ClassTask{
 public static void main(String args[]){
 Person p1=new Person();
 Student s1=new Student();
 Employee e1=new Employee();
 Undergraduate ug=new Undergraduate();
 Graduate g1 = new Graduate();
 Faculty f1=new Faculty();
 Master m1=new Master();
 Doctoral d1=new Doctoral();
 p1.showMsg();
 s1.showMsg();
 e1.showMsg();
 ug.showMsg();
 g1.showMsg();
 f1.showMsg();
 m1.showMsg();
 d1.showMsg();
 }
}
