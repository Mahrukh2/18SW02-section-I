class LabTask5{
 public static void main(String args[]){
  double array[]={5,9,10,100,45,18,77};
  double max=array[0];
  for(int j=1;j<7;j++)
  {
   if(array[j]>max)
   {
    max=array[j];
   }
  }
  System.out.println(max);
  }
 }