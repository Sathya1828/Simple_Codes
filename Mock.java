package Basic_Program;
import java.util.*;
class Mock{
    static Scanner s= new Scanner(System.in);
	    public static void main(String[] args) {
	  		int a[][] = new int[4][4];
	  		System.out.println("Input");
	  		for (int i = 0; i < a.length; i++) {
	  			for (int j = 0; j < a.length; j++) {
	  				a[i][j]=s.nextInt();
	  			}
	  		}
	  		for (int i = 0; i < a.length; i++) {
	  			for (int j = 0; j < a.length; j++) {
	  				System.out.print(a[i][j]+" ");
	  			}
	  			System.out.println();
	  		}
	  		System.out.println();
	  		for (int i = 0; i < a.length; i++) {
	  			for (int j = 0; j < a.length; j++) {
	  				if(i==0){
	  					int temp = a[i][j];
	  					a[i][j]= a[a.length-1][j];
	  					a[a.length-1][j]=temp;
	  				}
	  				System.out.print(a[i][j]+" ");
	  			}
	  			System.out.println();
	  		}
	}            
}
