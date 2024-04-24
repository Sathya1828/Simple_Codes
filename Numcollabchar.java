package Basic_Program;

import java.util.Scanner;

public class Numcollabchar {
    static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Random Num&Char: ");
		String user=s.next();
        char a[]=user.toCharArray();
        for (int i = 0; i < a.length-1; i+=2) {
			if(a[i+1]>'0'&&a[i+1]<'9')
				for (int j = 1; j <= a[i+1]-48; j++) {
					System.out.print(a[i]+"");
				}
		}
	}

}
