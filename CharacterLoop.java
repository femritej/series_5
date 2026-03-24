// This program prints each character of a word on a new line.

public class CharacterLoop {
public static void main(String[] args) {
String word = "banana";
for (int i = 0; i < word.length(); i++) {
System.out.println(word.substring(i, i + 1));
}
}
}