import java.util.Scanner;

public class NameInfo {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print(&quot;Enter your first name: &quot;);
String name = input.nextLine();
System.out.println(&quot;Hello, &quot; + name + &quot;!&quot;);
System.out.println(&quot;Your name has &quot; + name.length() + &quot;
characters.&quot;);
}
}