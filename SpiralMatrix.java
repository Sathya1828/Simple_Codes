package Basic_Program;
import java.util.*;
public class SpiralMatrix {
   public static void spiralmatrix(int row,int col){
	   int [][]matrix =new int[row][col];
	   int value=1;
	   int top=0,bottom=row-1,left=0,right=col-1;
	   while(top<=bottom&&left<=right){
		   for (int i = left; i <= right; i++) {
			matrix[top][i]=value++;
		}
		   top++;
		   for (int i = top; i <= bottom; i++) {
				matrix[i][right]=value++;
			}
		   right--;
		if(top<=bottom){
			for (int i = right; i >= left; i--) {
				matrix[bottom][i]=value++;
			}
		   bottom--;
		}
		if(left<=right){
			for (int i = bottom; i >= top; i--) {
				matrix[i][left]=value++;
			}
		   left++;
		}   
	   }
	   for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix.length; j++) {
			System.out.print(matrix[i][j]+" \t");
		}
		System.out.println();
	 }
   }
   static Scanner s = new Scanner(System.in);
   public static void main(String[] args) {
   System.out.println("Enter The Matrix If You Want:");
   int n=s.nextInt();
   spiralmatrix(n,n);
   }
}
