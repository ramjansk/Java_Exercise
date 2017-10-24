import java.util.Scanner;
class Factorial{
public static void main(String[] args){
int no,fact=1,i;
Scanner s=new Scanner(System.in);
System.out.println("Enter any number:");
no=s.nextInt();
for(i=1;i<=no;i++)
	{
	fact=fact*i;
	}
	System.out.println("The factorial is:"+fact);
}
}
