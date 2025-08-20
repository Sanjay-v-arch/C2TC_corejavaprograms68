//Program to demonstrate HashSet using user defined objects
package DaySeventeen.userdefinedobjects;
import java.util.HashSet;
import java.util.Set;

public class userdefinedobjects {

	public static void main(String[] args) {
		Set<Student> studentSet = new HashSet<Student>();
		addElements(studentSet);
		System.out.println(studentSet);		

	}
	static void addElements(Set<Student> studentSet) {

		Student s1 = new Student("sam",78);
		studentSet.add(s1);
		s1 = new Student("siva",66);
		studentSet.add(s1);
		s1 = new Student( "kala",73);
		studentSet.add(s1);
		s1 = new Student("butha",81);
		studentSet.add(s1);
		s1 = new Student("Nishanth",81);
		//duplicate element can't insert
		studentSet.add(s1); 

	}

}
