package Basic_Program;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=13;
        int x=n/2+1;
        for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				//if(j>=x != false && j<=n-x+1)
				if(j==x || j==n-x+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			if(i<=n/2)
				x--;
			else
				x++;
			System.out.println();
		}
	}

}
