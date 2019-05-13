class Studen{
 String name;
 int age;
 String addr;
 Studen(){
  this.name="unknown";
  this.age=0;
  this.addr="not available";
  }
   public void setInfo(String name,int age){
    System.out.println(this.name=name);
    System.out.println(this.age=age);
  }

  public void setInfo(String name,int age,String addr){
   System.out.println(this.name=name);
   System.out.println(this.age=age);
   System.out.println(this.addr=addr + "\n");
  }
 }
 class Lab6Task5{
  public static void main(String args[]){
   Studen[] obj=new Studen[10];
   obj[0]=new Studen();
   obj[0].setInfo("Maham",18,"house no:9889 Hyderabad");
   obj[1]=new Studen();
   obj[1].setInfo("Iqra",19,"house no.567 Jamshoro");
   obj[2]=new Studen();
   obj[2].setInfo("Alia",19,"house no.587 Jamshoro");
   obj[3]=new Studen();
   obj[3].setInfo("Unza",18,"house no.167 Sukkur");
   obj[4]=new Studen();
   obj[4].setInfo("Dua",19,"house no.456 Karachi");
   obj[5]=new Studen();
   obj[5].setInfo("Maha",19,"house no.477 Jamshoro");
   obj[6]=new Studen();
   obj[6].setInfo("Neha",19,"house no.567 Hyderabad");
   obj[7]=new Studen();
   obj[7].setInfo("Mahrukh",19,"house no.345 Sukkur");
   obj[8]=new Studen();
   obj[8].setInfo("Hina",18,"house no.3556 Hyderabad");
   obj[9]=new Studen();
   obj[9].setInfo("Anshara",18,"house no.677 Multan");
   }
  }




