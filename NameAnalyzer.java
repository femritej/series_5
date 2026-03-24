import java.util.Scanner;
// This program asks for the user&#39;s name and analyzes it.
public class NameAnalyzer {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter your name:");
String name = input.nextLine();
System.out.println("Hello, " + name + "!");
System.out.println("Length: " + name.length());
System.out.println("First letter: " + name.substring(0, 1));
System.out.println("Last letter: " + name.substring(name.length() -
1));
}
}