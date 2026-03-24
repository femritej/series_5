import java.util.Scanner;
// This program compares two words alphabetically.
public class AlphabeticalOrder {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the first word: ");
String w1 = input.nextLine();
System.out.print("Enter the second word: ");
String w2 = input.nextLine();
int result = w1.compareTo(w2);
if (result < 0) {
System.out.println(w1 + " comes before " + w2);
} else if (result > 0) {
System.out.println(w2 + " comes before " + w1);
} else {
System.out.println("The words are equal.");
}
}
}