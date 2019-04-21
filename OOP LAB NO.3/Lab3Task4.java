import java.util.*;
 class Lab3Task4{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter First Number :" );
   int a=sc.nextInt();
   System.out.println("Enter Second Number :");
   int b=sc.nextInt();
   System.out.println("Enter any operator :");
   char x=sc.next().charAt(0);
    if(x=='+')
    {
     int sum=a+b;
     System.out.println("The Sum = " + sum);
     }
    else if(x=='-')
    {
     int subtraction=a-b;
     System.out.println("The Subtraction = " + subtraction);
     }
    else if(x=='*')
    {
     int mul=a*b;
     System.out.println("The multiplication = " + mul);
     }
    else if(x=='/')
    {
     int div=a/b;
     System.out.println("The division = " + div);
     }
    else
    System.out.println("Invalid Operation");
 }
}