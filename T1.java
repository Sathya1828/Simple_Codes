 package Basic_Program;
import java.util.*;
public class T1 {
    static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		String a[][] = new String[6][5];
		 for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				a[i][j]=s.next(); 
			}
		}   // USer Value Finded
		  for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.println(a[i][j]+" ");
			}
		}
	}

}
