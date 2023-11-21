import java.util.Scanner;  
class Prog3 {

public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter number of table");
int table=s.nextInt();
for(int i=1;i<=10;i++){
System.out.println(table+"X"+i+"="+(table*i));
}
	
}


}