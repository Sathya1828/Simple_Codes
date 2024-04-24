package Basic_Program;
import java.util.*;
public class Matrix {
	static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
      System.out.println("Enter the Size of Matrix: ");
      int n=s.nextInt(),value=1;
      int [][]a=new int[n][n];
      for (int i = 0; i < a.length; i++) {
		for (int j = n/2; j < a.length; j++) {
				a[i][j]=value++;
		}
		for (int k = n/2-1; k>=0; k--) {
					a[i][k]=value++;
			}
		System.out.println();
	}  
    //Print the States
      for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[i][j]+"\t");
		}
		System.out.println();
	  }
    }
}

