import java.util.Scanner;
class LeapYearCount{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter starting year above 1000");
int startYear=s.nextInt();
if(startYear<=1000){
System.out.println("Please Enter Leap year above 1000");
return;}
System.out.println("Enter Ending year");
int endYear=s.nextInt();
System.out.println("Leap Year between" +startYear +"and" +endYear);
for(int i=startYear;i<=endYear;i++){
if((i%4==0&&i%100!=0)||(i%400==0)){

System.out.println(i);



}

}



















}




}