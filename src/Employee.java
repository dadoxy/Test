public class Employee {
	/*
	 * Employee class that implements searchable interface with attributes name,
	 * surname and age
	 */
	protected String name;
	protected String surname;
	private Integer age;

	/*
	 * Constructor for employee class including name, surname and age
	 */
	public Employee(String name, String surname, Integer age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	
	public String getAge() {
		return age.toString();
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", age="
				+ age + "]";
	}

}
