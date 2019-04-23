class OuterContinue{
 public static void main(String args[]){
 Outer:
  for(int i=0;i<=10;i++)
  {
   for(int j=0;j<5;j++){
   if(j==2)
   {
   continue Outer;
   }
   System.out.println(j);
   }
  System.out.println();
}
   }
}