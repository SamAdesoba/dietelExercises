package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
	private String firstName;
	private String lastName;
	private String id;
	private String department;
	private double salary;

	public Employee(String firstName, String lastName, String id, String department, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.department = department;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getId() {
		return id;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee{" +
				  "firstName='" + firstName + '\'' +
				  ", lastName='" + lastName + '\'' +
				  ", id='" + id + '\'' +
				  ", department='" + department + '\'' +
				  ", salary=" + salary +
				  '}';
	}

	class Main{
		public static void main(String[] args) {
			Employee[] employees = {
					  new Employee("John", "Tola", "JT001", "AA", 100.0),
					  new Employee("Ade", "Soba", "AS002", "AB", 200.0),
					  new Employee("Sam", "Son", "SS003", "SS", 300.0),
					  new Employee("Alabi", "Tobi", "AT004", "AT", 400.0),
					  new Employee("Ordinaka", "Adefolarin", "AA005", "AA", 500.0),
					  new Employee("As", "In", "AI001", "AI", 600.0),
					  new Employee("John", "Tola", "JT001", "AA", 100.0),
					  new Employee("John", "Tola", "JT001", "AA", 100.0),
					  new Employee("John", "Tola", "JT001", "AA", 100.0),
					  new Employee("John", "Tola", "JT001", "AA", 100.0),
					  new Employee("John", "Tola", "JT001", "AA", 100.0),
					  new Employee("John", "Tola", "JT001", "AA", 100.0),
					  new Employee("John", "Tola", "JT001", "AA", 100.0),
			};

			Map<String, List<Employee>>  map = Arrays.stream(employees)
					  												.collect(Collectors.groupingBy(Employee::getDepartment));

			System.out.println(map);
			System.out.println();

			map.forEach((dept, employeeList) -> {
				System.out.printf("%s : %.2f",
						  employeeList.stream()
									 .mapToDouble(Employee::getSalary)
									 .sum());
				System.out.println();
			});
		}
	}




}


