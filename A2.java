package Basic_Program;
import java.util.*;
public class A2 {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		String sen="house ! no: 12",rev="",ans="";
		String []a=sen.split(" ");
		for (int i = 0; i < a.length; i++) {
			rev+=a[i];
		}
		for (int i = rev.length()-1; i >= 0; i--) {
			ans+=rev.charAt(i);
		}
		rev="";
     for(int i=0,j=0;i<sen.length()-1||j<ans.length();i++)
    	 if(sen.charAt(i)==' ')
    		 rev+=sen.charAt(i);
    	 else
    		 rev+=ans.charAt(j++);
     
       System.out.println(rev);
	}
}
