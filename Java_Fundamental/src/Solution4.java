/*Write a program to initialize an array of 5 float numbers. 
 * Loop through the array using a for loop and print each number.
This question involves array (which can hold primitive and is of fixed size) and for loops
 */
public class Solution4 {
public static void main(String[]args) {
	float[] array= {2.5f,3.5f,4.2f,5.2f,8.9f};	
	
	for(int i=0;i<array.length;i++) {
		System.out.println("Float array list value:"+array[i]);
	}
}
}
