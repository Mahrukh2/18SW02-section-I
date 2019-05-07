import java.util.*;
class Arrays{
 int a[]=new int[5];
 public void PopulateArray()
 {
  Scanner S=new Scanner(System.in);
  System.out.println("Enter Elements : ");
  for(int i=0;i<5;i++){
   a[i]=S.nextInt();
   }
  }
  public void Print()
  {
   System.out.println("Even Numbers : ");
    for(int i=0;i<5;i++){
    if(a[i]%2!=0)
    continue;
    System.out.println(a[i]+" ");
    }
    System.out.println();
    System.out.println("Odd Numbers : ");
    for (int i=0;i<5;i++){
     if(a[i]%2==0)
     continue;
     System.out.println(a[i] + " ");
     }
    }
  }
  class Lab5Task2{
    public static void main(String args[]){
      Arrays arr1=new Arrays();
      arr1.PopulateArray();
      arr1.Print();
     }
    }