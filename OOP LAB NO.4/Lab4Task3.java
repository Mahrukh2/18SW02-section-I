import java.util.*;
 class Lab4Task3{
  public static void main(String args[]){
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter any number : ");
   int n=sc.nextInt();
   int result=0;
   for(int i=1;i<=n;i++)
   { 
     result+=i;
   }
   System.out.println("Sum is : " + result);
   }
  } 