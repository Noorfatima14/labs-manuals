import java.util.Scanner;
class Prog 4 {

public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter a year");
int year=s.nextInt();
float day=year*365f;
float months=year*12f;
System.out.println("year to months"+months);	

System.out.println("Days:"+day);
}


}