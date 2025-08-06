package DayThree;

public class EncapsulationDemo {
 static class OopsConceptDemo{
	int SerialNum;
	String Name;
	int Age;
	public void setSerialNum(int serialNum) {
		this.SerialNum = serialNum;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public void setAge(int age) {
		this.Age = age;
	}
	@Override
	public String toString() {
	    return "SerialNum: " + SerialNum + ", Name: " + Name + ", Age: " + Age;
	}

	
	
}


	public static void main(String[] args) {
		//object creation 
				OopsConceptDemo obj = new OopsConceptDemo();
				obj.setSerialNum(101);
				obj.setName("Pooja");
				obj.setAge(20);
				System.out.println(obj);

	}

}
