import java.util.Scanner;
class Prog2 {

public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter radius of circle");
double r=s.nextDouble();
double circumference=2*3.17*r;
System.out.println("circumference of circle is =" +circumference);
double area=2*3.17*r*r;

System.out.println("Area of circle is =" +area);
}


}