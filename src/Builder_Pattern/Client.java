package Builder_Pattern;

public class Client {
	public static void main(String[] args) throws Exception {
		Student s = Student.getBuilder().name("Sai").rollNum(35).age(50).build();
		System.out.print("student info "+s.getName()+" "+s.getAge());
	}
}
