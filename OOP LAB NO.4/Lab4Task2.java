import java.util.*;
  class Lab4Task2{
 public static void main(String args[]){
	 int t,s,e;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter Table ");
  t=sc.nextInt();
  System.out.println("Enter starting point");
  s=sc.nextInt();
  System.out.println("Enter end point");
  e=sc.nextInt();
  int result;
  for(int i=s;i<=e;i++)
  {
	  result=t*i;
	  System.out.println(t + "x"+ i+"=" + result);
}
}
}