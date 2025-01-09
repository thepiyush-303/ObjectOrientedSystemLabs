import java.util.Scanner;

public class New{
	public static void main(String[] args) {
		String name = "Piyush";
		System.out.println(name);
		System.out.println("I am learning Java");
		System.out.println("2+2 is " + (2+2));
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter username");
		String inputName = myObj.nextLine();
		System.out.println("username is : " + inputName);
	}
}
