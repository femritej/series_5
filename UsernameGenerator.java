import java.util.Scanner;
// This program generates a simple username from first and last name.

public class UsernameGenerator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter your first name: ");
String first = input.nextLine();
System.out.print("Enter your last name: ");
String last = input.nextLine();
// Username: first 3 letters of first name + last 3 letters of last

String user = first.substring(0, 3) + last.substring(last.length() -
3);
System.out.println("Your username is: " + user);
}
}