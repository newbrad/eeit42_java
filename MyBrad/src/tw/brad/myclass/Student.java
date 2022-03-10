package tw.brad.myclass;

public class Student {
	private int ch, eng, math;
	private String name;
	public Student(String name, int ch, int eng, int math) {
		this.name = name;
		this.ch = ch;
		this.eng = eng;
		this.math = math;
	}
	
	public int score() {
		return ch + eng + math;
	}
	public double avg() {
		return score() / 3.0;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
