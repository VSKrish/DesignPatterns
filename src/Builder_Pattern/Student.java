package Builder_Pattern;

public class Student {
	private int rollNum;
	private String name;
	private String address;
	private float CGPA;
	private int age;
	
	private Student(Builder b) {
		this.rollNum=b.rollNum;
		this.name=b.name;
		this.address=b.address;
		this.CGPA=b.CGPA;
		this.age = b.age;
	}
	
	public int getRollNum() {
		return rollNum;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public float getCGPA() {
		return CGPA;
	}

	public int getAge() {
		return age;
	}

	public static Builder getBuilder() {
		return new Builder();
	}
	
	public static class Builder {
		private int rollNum;
		private String name;
		private String address;
		private float CGPA;
		private int age;
		private Builder() {
			
		}
		public Builder rollNum(int rollNum) {
			this.rollNum = rollNum;
			return this;
		}
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		public Builder address(String address) {
			this.address = address;
			return this;
		}
		public Builder CGPA(float cGPA) {
			CGPA = cGPA;
			return this;
		}
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		public Student build() throws Exception{
			// Do some validations if needed
			if(!isValid()) {
				throw new Exception("Wrong Parameters");
			}
			return new Student(this);
		}
		public boolean isValid() {
		    // Perform additional validation if needed
		    return this.name != null && this.name.length() > 0
		            && this.rollNum > 0
		            && (this.address == null || this.address.length() > 0);
		}
		
	}
}
