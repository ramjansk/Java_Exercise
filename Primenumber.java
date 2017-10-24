import java.util.Scanner;
class Primenumber{
public static void main(String[] args){
int no,i;
Scanner s=new Scanner(System.in);
System.out.println("Enter any number:");
no=s.nextInt();
if(no==1)
{
System.out.println("Smallest prime number is 2");
}
for(i=2;i<no;i++)
{
if(no%i==0)
	{
	System.out.println("Not prime");
	break;
	}
	}
if(no==i)
	{
	System.out.println("prime");
	}	
}
}