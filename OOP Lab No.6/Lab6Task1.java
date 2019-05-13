class Author
{
 private String name;
 private String email;
 private char gender;
 public Author(String name , String email,char gender)
 {
  this.name=name;
  this.email=email;
  this.gender=gender;
 }
   public String getName()
   {
    return name;
   }
   public void setEmail(String email)
   {
    this.email=email;
   }
   public String getEmail()
   {
    return email;
   }
   public char getGender()
   {
    return gender;
   }
   public String toString()
   {
  return "Author[ name  = " + name  +  " , gender = " + gender + " , email = " + email + "]";
   }
}
   class Lab6Task1{
    public static void main(String [] args)
    {
     Author a=new Author("Ttan AhTech","ahTech@Somewhere.com",'m');
  
     a.setEmail("AhTech@Somewhere.com");
     System.out.println(a);
     System.out.println("Name is : " + a.getName());
     System.out.println("Gender is " + a.getGender());
     System.out.println("Email is " + a.getEmail());
 }
   }