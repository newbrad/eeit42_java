package tw.brad.myclass;

import java.io.Serializable;

public class Student implements Serializable{
	private int ch, math;
	private transient int eng;
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
