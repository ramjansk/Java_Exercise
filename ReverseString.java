/*import java.util.*;
 public class ReverseString { 
 public static void main(String args[]){
 String str; 
 String rStr; 
 Scanner bf=new Scanner(System.in);
 //input an integer number
 System.out.print("Enter any string: ");
 str=bf.nextLine();
 //Reversing String 
 rStr=;
 for(int loop=str.length()-1;loop>=0;loop--)
 rStr= rStr + str.charAt(loop); 
 System.out.println("Reversed string is: " + rStr);
 }
 }
*/


 //java program to ReverseString using StringBuilder
import java.lang.*;
import java.io.*;
import java.util.*;
 
// Class of ReverseString
class ReverseString
{
    public static void main(String[] args)
    {
        String input = "Geeks for Geeks";
 
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(input);
 
        // reverse StringBuilder input1
        input1 = input1.reverse();
 
        // print reversed String
        for (int i=0; i<input1.length(); i++)
            System.out.print(input1.charAt(i));
    }
}

