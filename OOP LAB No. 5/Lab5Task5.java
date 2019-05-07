class MarkSheet{
 int Java;
 int DCLD;
 int CPP;
 int res;
 double per;
 public void totalmar(){
  res=Java+DCLD+CPP;
  System.out.println("Result  = " + res);
  }
  public void per(){
   per=res*100/300;
   System.out.println("Percentage = " + per);
   }
   public void grade(){
   if(per>90)
    System.out.println("Grade=90");
   else if(per>=80 && per<=90)
    System.out.println("Grade = B");
   else if(per>=70 && per<80)
    System.out.println("Grade=C");
   else if(per>=60 && per<70)
    System.out.println("Grade=D");
   else if(per<60)
    System.out.println("FAIL");
   }
 }
 class  Lab5Task5{
   public static void main(String[] args){
   MarkSheet m1=new MarkSheet();
   m1.Java=78;
   m1.DCLD=90;
   m1.CPP=90;
   m1.totalmar();
   m1.per();
   m1.grade();
   }
}