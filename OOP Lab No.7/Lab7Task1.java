class Circle{
private double radius;
private String color;
public Circle(){
this.radius=1.0;
this.color="red";
}
public Circle(double radius){
this.radius=radius;
this.color="red";
}
public Circle(double radius,String color){
this.radius=radius;
this.color=color;
}
public double getRadius(){
return this.radius;
}
public String getColor(){
return this.color;
}
public void setRadius(double radius){
this.radius=radius;
}
public void setColor(String color){
this.color=color;
}
public String toString(){
return "Circle[radius = " + radius + " , color = " + color + "]";
}
public double getArea(){
return radius*radius*3.14;
}
}
class Cylinder extends Circle{
private double height;
public Cylinder(){
 super();
 this.height=1.0;
 }
 public Cylinder (double hieght){
 super();
 this.height=height;
 }
 public Cylinder(double height ,double radius){
 super(radius);
 this.height=height;
 }
 public Cylinder(double height ,double radius , String color){
 super(radius,color);
 this.height=height;
 }
public double getHeight(){
return this.height;
}
public void setHeight(double height){
this.height=height;
}
public double getVolume(){
return getArea()*height;
}
public String toString(){
return "This is cylinder";
}
}
class Lab7Task1{
public static void main(String args[]){
Cylinder c1=new Cylinder();
System.out.println("Radius is " + c1.getRadius());
System.out.println("Height is " + c1.getHeight());
System.out.println("Color is " + c1.getColor());
System.out.println("Area is " + c1.getArea());
System.out.println("Volume is " + c1.getVolume());
}
}





