package JavaConceptExample.AbstractExample;

public class AbstractDemo {
	public static void main(String[] args) {
		Trainer s =new TechTrainer();
		
		s.session();
		s.checks();
		
		s =new SoftTrainer();
		s.checks();
		s.session();
	}

}
