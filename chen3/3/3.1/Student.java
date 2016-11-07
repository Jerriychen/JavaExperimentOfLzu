package s3;

public class Student extends Person {
	private int id;
	private int score;
	public Student(String name,int id,int age,char sex,int score) {
		super(name,age,sex);
		this.id=id;
		this.score=score;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void display() {
		super.introduceme();
		System.out.println("id: "+id);
		System.out.println("score: "+score);
	}
	
	
}
