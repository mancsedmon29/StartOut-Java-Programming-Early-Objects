package chapter3;

public class TestScores {
	private int testScore;
	private double average;
	
	public void get3Score(int score) {
		testScore += score;
	}
	
	public double getAverage() {
		average = testScore / 3;
		return average;
	}
}
