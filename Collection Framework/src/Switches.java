
import java.util.Scanner; 
public class Switches {
public static void main(String[]args) {
	
	Scanner input=new Scanner (System.in);
	
	System.out.println("Please input the single character garade");
	
	char grade=input.next().toLowerCase().charAt(0);
	
	switch(grade){
	case 'A':
	case 'a':
		System.out.println("well done");
		break;
	case 'B':
	case'b':
		System.out.println("Can do better");
	case'C':
	case'c':
		System.out.println("Need to work on concept");
		break;
	case'D':
	case'd':
		System.out.println("Need to work hard");
		break;
		default:
			System.out.println("you failed");
			break;
		}
	input.close();
	System.out.println("Thank you");
}

}
