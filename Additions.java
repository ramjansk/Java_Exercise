import java.util.Scanner;
class Additions{
public static void main(String[] args){
int a,b,c;
Scanner s= new Scanner(System.in);
System.out.println("Enter any two number:");
a=s.nextInt();
b=s.nextInt();
c=a+b;
System.out.println("The sum is:" + c);
}
}