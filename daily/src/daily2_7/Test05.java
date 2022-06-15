package daily2_7;

public class Test05 implements Cloneable {

	public static void main(String[] args) {
		int[] a = {8,5,2,4,6,3,7,9};
		int[] ac = a.clone();
		int[][] b = {{-1,5,6,7},{6,7,8,9}};
		int[][] bc = b.clone();
		
		
		for(int i = 0; i<a.length; i++) {
			System.out.print("["+a[i]+"]" + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i<a.length; i++) {
			System.out.print("["+ac[i]+"]" + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i<b.length;i++) {
			for(int j = 0; j<b[i].length;j++) {
				System.out.print("["+b[i][j]+"]"+" ");
			}
			System.out.println();
		}
		
		for(int i = 0; i<bc.length;i++) {
			for(int j = 0; j<bc[i].length;j++) {
				System.out.print("["+bc[i][j]+"]"+" ");
			}
			System.out.println();
		}
	}

}
