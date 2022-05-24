package daily1_12;

public class addMatrix {
	static boolean addmat(int x[][], int y[][], int z[][]) {
		if (x.length != y.length || y.length != z.length)
			return false;
		for (int i = 0; i < x.length; i++)
			if (x[i].length != y[i].length || y[i].length != z[i].length)
				return false;
		for (int i = 0; i < x.length; i++)
			for (int j = 0; i < x[i].length; j++)
				z[i][j] = x[i][j] + y[i][j];
		return true;
	}

	static void printmat(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++)
			System.out.println(m[i][j] + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6}};
		int[][] b = {{6,3,4},{5,1,2}};
		int[][] c = new int[2][3];
		
		if(addmat(a, b, c)) {
			System.out.println("행렬a"); printmat(a);
			System.out.println("\n행렬b"); printmat(b);
			System.out.println("\n행렬c"); printmat(c);
		}
		
	}

}
