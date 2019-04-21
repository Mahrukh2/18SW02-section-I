import java.util.*;
  class Lab3Task3{
   public static void main(String args[]){
   boolean vowel=false;
    char c;
    Scanner character= new Scanner (System.in);
    System.out.println("Enter a character");
    c=character.next().charAt(0);
    switch(c)
    {
     case 'a':
     case 'e':
     case 'i':
     case 'o':
     case 'u':
     case 'A':
     case 'E':
     case 'I':
     case 'O':
     case 'U':
     vowel=true;}
     if(vowel==true)
     {
      System.out.println(c + " is a vowel");
     }
     else  if((c>='a' && c<='z') || (c>='A' && c<='Z')){
        System.out.println(c + " is a consonant");}
      else
       System.out.println("Input is not an alphabet");


  }
}

