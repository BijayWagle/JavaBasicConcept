/*Write a program to reverse the order of words in a sentence
This question involves String concepts. .split(" ") method i.e split by space, might be helpful here

Use your palindrome assignment for reference if needed
 * 
 */
import java.util.Scanner;
public class Solution1 {
public static void main(String[]args) {
	Scanner input=new Scanner(System.in);
	
	System.out.println("Enter the sentence");
	String user=input.nextLine();
	String []array=user.split(" ");
	String output="";
	for (int i = array.length - 1; i >= 0; i--) {

		output+=array[i];
	}
	input. close();
	System.out.println("Reverse order of sentence:"+ output);
}
}
