package test;

public class Result {

	public static void main(String[] args) {
		int n[] = { 1, 2, 3, 4, 5 };
<<<<<<< HEAD
		String name[] = { "aaa", "bbb", "ccc", "ddd", "eee" };
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		String name[] = { "문재인", "윤석열", "김정은", "홍준표", "박근혜" };
=======
		String name[] = { "aaa", "bbb", "ccc", "ddd", "eee" };
>>>>>>> ac86093195523886c551dfac2e155f3dcf284e59
=======
		String name[] = { "aaa", "bbb", "ccc", "ddd", "eee" };
>>>>>>> ac86093195523886c551dfac2e155f3dcf284e59
=======
		String name[] = { "aaa", "bbb", "ccc", "ddd", "eee" };
>>>>>>> ac86093195523886c551dfac2e155f3dcf284e59
>>>>>>> 044cd740b06f814b0f6ed049e1d2ab2ff2246a27
		int kuk[] = { 92, 82, 67, 58, 84 };
		int eng[] = { 89, 85, 78, 60, 95 };
		int mat[] = { 96, 92, 80, 44, 70 };
		int sum[] = new int[5];
		char myGrade = 0;
		int rank[] = new int[5];
<<<<<<< HEAD

=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		double avg[] = new double [5];
		
=======

>>>>>>> ac86093195523886c551dfac2e155f3dcf284e59
=======

>>>>>>> ac86093195523886c551dfac2e155f3dcf284e59
=======

>>>>>>> ac86093195523886c551dfac2e155f3dcf284e59
>>>>>>> 044cd740b06f814b0f6ed049e1d2ab2ff2246a27
		for (int i = 0; i < n.length; i++) {
			sum[i] = kuk[i] + eng[i] + mat[i];
			
		}
		
		for (int i = 0; i < n.length; i++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
			avg[i]= (double) sum[i]/3;
		
		}
		
		for (int i = 0; i < n.length; i++) {
=======
>>>>>>> ac86093195523886c551dfac2e155f3dcf284e59
=======
>>>>>>> ac86093195523886c551dfac2e155f3dcf284e59
=======
>>>>>>> ac86093195523886c551dfac2e155f3dcf284e59
>>>>>>> 044cd740b06f814b0f6ed049e1d2ab2ff2246a27
			rank[i] = 1;
			for (int j = 0; j < n.length; j++) {
				if (sum[i] < sum[j])
					rank[i] += 1;
			}
		}
		
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		System.out.println("                               <성   적   표>                                      ");
		System.out.println("================================================================================");
		System.out.println(
				"번호" + "\t" + "이름" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균 "+ "\t" + "학점" + "\t" + "등수");
		System.out.println("--------------------------------------------------------------------------------");
		for (int i = 0; i < n.length; i++) {

			switch (sum[i]/30) {
=======
=======
>>>>>>> ac86093195523886c551dfac2e155f3dcf284e59
=======
>>>>>>> ac86093195523886c551dfac2e155f3dcf284e59
>>>>>>> 044cd740b06f814b0f6ed049e1d2ab2ff2246a27
		System.out.println(
				"번호" + "\t" + "이름" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "학점" + "\t" + "등수");

		for (int i = 0; i < n.length; i++) {

			switch (sum[i] / 30) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ac86093195523886c551dfac2e155f3dcf284e59
=======
>>>>>>> ac86093195523886c551dfac2e155f3dcf284e59
=======
>>>>>>> ac86093195523886c551dfac2e155f3dcf284e59
>>>>>>> 044cd740b06f814b0f6ed049e1d2ab2ff2246a27
			case 10:
			case 9:
				myGrade = 'A';
				break;
			case 8:
				myGrade = 'B';
				break;
			case 7:
				myGrade = 'C';
				break;
			case 6:
				myGrade = 'D';
				break;
			default:
				myGrade = 'F';
			}
		
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		System.out.println(n[i] + "\t" + name[i] + "\t" + kuk[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + sum[i] +  "\t" + String.format("%.1f", avg[i]) + "\t"
				+ myGrade + "\t" + rank[i]);

	}
		System.out.println("--------------------------------------------------------------------------------");
=======
=======
>>>>>>> ac86093195523886c551dfac2e155f3dcf284e59
=======
>>>>>>> ac86093195523886c551dfac2e155f3dcf284e59
>>>>>>> 044cd740b06f814b0f6ed049e1d2ab2ff2246a27
		System.out.println(n[i] + "\t" + name[i] + "\t" + kuk[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + sum[i] + "\t"
				+ myGrade + "\t" + rank[i]);

	}
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ac86093195523886c551dfac2e155f3dcf284e59
=======
>>>>>>> ac86093195523886c551dfac2e155f3dcf284e59
=======
>>>>>>> ac86093195523886c551dfac2e155f3dcf284e59
>>>>>>> 044cd740b06f814b0f6ed049e1d2ab2ff2246a27
}
}
