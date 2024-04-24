package Basic_Program;
import java.util.*;
public class UppertoLow {
  static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
    System.out.println("Enter the Name:");
	String sen=s.next(),small="",cap="",org="";
	for(int i = 0; i < sen.length(); i++) {
		if(sen.charAt(i)>=65&&sen.charAt(i)<=90)
			cap+=sen.charAt(i);
		else if(sen.charAt(i)>=97&&sen.charAt(i)<=122)
			small+=sen.charAt(i);
	}
	for (int i = 0; i < Math.max(cap.length(), small.length()); i++) {
	System.out.print(i<(cap.length())?cap.charAt(i):"");
	System.out.print(i<(small.length())?small.charAt(i):"");
	}
  }
}
