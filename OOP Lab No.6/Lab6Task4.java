class Area{
 public  void printArea(int x,int y)
 {
  System.out.println("Area Of Rectangle : ");
  System.out.println(x*y);
 }
 public  void printArea(int x)
 {
  System.out.println("Area Of Square : ");
  System.out.println(x*x);
 }
}
class Lab6Task4{
 public static void main(String args[])
 {
 Area a=new Area();
 a.printArea(9,8);
 a.printArea(9);
 }
}
