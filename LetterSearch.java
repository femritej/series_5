
    import java.util.Scanner;
// This program finds the first occurrence of a letter in a word.
public class LetterSearch {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print(" Enter a word: ");
String word = input.nextLine();
System.out.print("Enter a letter to search for: ");
String letter = input.nextLine();
int index = word.indexOf(letter);
if (index == -1) {
System.out.println("Letter not found.");
} else {
System.out.println("Found at index: "+ index);
}
}
}

