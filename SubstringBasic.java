// This program demonstrates substring() with inclusive/exclusive indices.
public class SubstringBasic {
public static void main(String[] args) {
String word = "computer";
System.out.println(word.substring(0, 3)); // &quot;com&quot;
System.out.println(word.substring(3)); // &quot;puter&quot;
System.out.println(word.substring(1, 4)); // &quot;omp&quot;
}
}