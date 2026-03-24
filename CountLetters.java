// This program counts how many times &#39;a&#39; appears in a word.
public class CountLetters {
public static void main(String[] args) {
String word = "banana";
int count = 0;
for (int i = 0; i < word.length(); i++) {
if (word.substring(i, i + 1).equals("a")) {
count++;
}
}
System.out.println("Number of a's: " + count);
}
}