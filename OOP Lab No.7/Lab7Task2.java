class Person {
protected String name;
protected String adr;
public Person(String name , String adr){
this.name=name;
this.adr=adr;
}
public String  getName()
{
return name;
}
public String getAddress(){
return adr;
}
public void setAddress(String adr){
this.adr=adr;
}
public String toString()
{
return "Person[name = " + name + ",address = " + adr + "]";
 }
}
class Student extends Person
{
protected String program;
protected int year;
protected double fee;
 public Student (String name,String adr,String program,int year , double fee){
 super(name,adr);
 this.program=program;
 this.year=year;
 this.fee=fee;
 }
 public String getProgram()
 {
 return program;
 }
 public void setProgram(String program)
 {
 this.program=program;
 }
 public int getYear(){
 return year;
 }
 public void setYear(int year)
 {
 this.year=year;
 }
 public double getFee(){
 return fee;
 }
 public void setFee(double fee){
 this.fee=fee;
 }
 public String toString(){
 return "Student[Person[name =" + name + " ,address = " + adr + " , program = " + program + ", year = " + year + " ,fee = " + fee + "]";
 }
}
class Staff extends Person{
protected String school;
protected double pay;
public Staff(String name,String adr,String school,double pay){
super(name,adr);
this.school=school;
this.pay=pay;
}
public String getSchool(){
return school;
}
public void setSchool(String school){
this.school=school;
}
public double getPay(){
return pay;
}
public void setpay(double pay){
this.pay=pay;
}
public String toString()
{
return "Staff[person[name = " + name + ", address = " + adr + " ,school = " + school + " ,pay = " + pay  + "]";
}
}
class Lab7Task2{
public static void main(String args[]){
Person p=new Person("Mahrukh" , "house no.45 Block a1, Hyderabad");
Student s=new Student("Mahrukh","xyz","Software Engineering",1,4000);
Staff s1=new Staff("Mahrukh","block C1, unit no.6","ZS",2000);
System.out.println(s.toString());
System.out.println(s1.toString());
  }
}







