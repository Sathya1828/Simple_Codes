package Basic_Program;

public class Collection {

	public static void main(String[] args) {
	int [][]a = {{1,1,0,1},{1,0,0,1},{1,1,0,1}};
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 4; j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	}

}
