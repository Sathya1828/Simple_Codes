package Basic_Program;

public class odd {

	public static void main(String[] args) {
		int n=13;
		//String sen = "racecar";
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if((i<=n/2&&j<=n/2)&&(i+j>=n/2)||(i<=n/2&&j>=n/2)&&(i+j<=n/2))
	             System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
