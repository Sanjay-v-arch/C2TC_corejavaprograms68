package Day3.Entity;

public class Student {
	private int sid;
	private String Sname;
	public Student() {
		System.out.println("Constructure");
	}
	
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.Sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", Sname=" + Sname + "]";
	}
	

}
