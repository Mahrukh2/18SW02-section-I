class Methods{
 public void disp(char c , int num)
 {
  System.out.println("Char : " + c + "  " + " Integer : " + num);
 }
 public void disp(int num ,char c)
 {
  System.out.println("Integer : " + num + "  " + "Char : " + c);
 }
}
class Lab6Task3{
 public static void main(String arg[]){
  Methods obj = new Methods();
  obj.disp('x',2);
  obj.disp(8,'y');
  }
 }