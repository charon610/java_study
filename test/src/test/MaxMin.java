package test;

public class MaxMin {

	public static void main(String[] args) {
		int score[] = { 98, 70, 45, 60, 83 };
		int rank[] = new int[5];

		for (int i = 0; i < score.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < score.length; i++) {
				if (score[i] < score[j])
					rank[i] += 1;
			}
		}

		for (int i = 0; i < score.length; i++) {
			System.out.println("점수:" + score[i] + "\t" + "등수:" + rank[i]);
		}
	}

}
