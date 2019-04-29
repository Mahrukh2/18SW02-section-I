class TaskPart3{
 public static void main(String args[]){
  int i,j,k;
  int x=1;

  for(i=1;i<=5;i++){
   for(j=5;j>=i;j--){
    System.out.print(" ");
    }
    for(k=1;k<=x;k++)
    {
    System.out.print("*");
    }
     x=x+2;
    System.out.println();
   }
}
}




