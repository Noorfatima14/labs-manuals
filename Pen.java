class Pen{
String color;
String shape;
String size;
public void printColor(){
System.out.println("THe color of thid pen is" +this.color);
System.out.println("THe shape of thid pen is" +this.shape);
System.out.println("THe size of thid pen is" +this.size);

}

}
public class Oop{
public static void main(String [] args){
Pen p1=new Pen();
p1.color="blue";
p1.shape="rectangle";
p1.size= "4cm diameter";
p1.printColor();
Pen p2=new Pen();
p2.color="purple";
p2.shape="circle";
p2.size= "5X2";
p2.printColor();
Pen p3=new Pen();
p3.color="pink";
p3.shape="triangle";
p3.size=  "2L";
p3.printColor();
}

}