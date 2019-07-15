class Shape
{
String color;
boolean filled;
 Shape()
 {
 color="pink";
 filled=true;
 }
public Shape(String color , boolean filled)
{
this.color=color;
this.filled=filled;
}
public String getColr()
{
return color;
}
public void setColor(String color)
{
this.color=color;
}
public boolean isFilled()
{
return filled;
}
public void setFilled(boolean filled)
{
this.filled=filled;
}
public String toString()
{
return "Shape[color= " + color + "filled = " + filled + "]";
}
}
class Circle extends Shape
{
double radius;
final double PI =3.14;
   Circle()
   {
   radius=1.0;
   }
   public Circle(double radius)
   {
   this.radius=radius;
   }
   public Circle(double radius,String color ,boolean filled)
   {
   this.radius=radius;
   this.color=color;
   this.filled=filled;
   }
 public double getRadius()
 {
 return radius;
 }
 public void setRadius(double radius)
 {
 this.radius=radius;
 }
 public double getArea()
 {
  return (PI*radius*radius);
 }
public double getPerimeter(){
return (2*PI*radius);
}
public String toString(){
return "Circle[Shape[radius = " + radius + " , color = " + color + " , filled " + filled + "]";
 }
}
class Rectangle extends Shape
{
double width;
double length;
final double PI=3.14;
 Rectangle()
 {
 width=1.0;
 length=1.0;
 }
 public Rectangle(double width , double length)
 {
 this.width=width;
 this.length=length;
 }
 public Rectangle(double width,double length,String color ,boolean filled)
 {
 this.width=width;
 this.length=length;
 this.color=color;
 this.filled=filled;
 }
 public double getWidth()
 {
 return width;
 }
 public void setWidth(double width)
 {
 this.width=width;
 }
 public double getLength()
 {
 return length;
 }
 public void setLength(double length)
 {
 this.length=length;
 }
 public double getArea()
 {
 return (width*length);
 }
 public double getPerimeter(){
 return (2*length+2*width);
 }
 public String toString()
 {
 return "Rectangle[Shape[width = " + width + " , length = " + length + " , color = " + color + " ,filled = " + filled + "]";
 }
}
class Square extends Rectangle
{
 double side;
  public Square()
  {
   side=2.0;
  }
public Square(double side)
{
 this.side=side;
}
public Square(double side,String color,boolean filled)
{
this.side=side;
this.color=color;
this.filled=filled;
}
public double getSide()
{
return side;
}
public void setSide(double side)
{
this.side=side;
}
public void setWidth(double side)
{
this.side=side;
}
public void setLength(double side)
{
this.side=side;
}
public String toString()
{
return "Square[Rectangle[side = " + side + ", color =  " + color + ", filled = " + filled + "]";
}
}
class Lab7Task3{
public static void main(String args[]){
Shape s1=new Shape("Red",true);
System.out.println("Shape's detail = " + s1.toString());
Circle c=new Circle(9.0,"Pink",true);
System.out.println("Area of circle = " + c.getArea());
System.out.println("Perimeter of Circle = " + c.getPerimeter());
Rectangle r=new Rectangle(5.0,4.0);
System.out.println("Area of Rectangle = " + r.getArea());
System.out.println("Perimeter of Rectangle = " + r.getArea());
Square s=new Square(4.0);
System.out.println(s.toString());
 }
}

