package AssignmentsByRatan;

public class FirstAssignment {
	
	int x=22;
	int y=34;

	public static void main(String[] args) {
		m1(); //same area , same method direct access
		m2();
		

	}
	static void m1()
	{
		FirstAssignment obj = new FirstAssignment();
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
	static void m2()
	{
		FirstAssignment obj1 = new FirstAssignment();
		System.out.println(obj1.x);
		System.out.println(obj1.y);
	}

}
