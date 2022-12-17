
public class MainClass {

	public static void main(String[] args) {
		
		Employee employee1=new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
		Employee employee2=new Employee("Mark Jones", 39119, "IT", "Programmer");
		Employee employee3=new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

		System.out.println(employee1.get_employee_name()+" "+employee1.get_employeeId()+" "+employee1.get_department()+" "+employee1.get_position());
		System.out.println(employee2.get_employee_name()+" "+employee2.get_employeeId()+" "+employee2.get_department()+" "+employee2.get_position());
		System.out.println(employee3.get_employee_name()+" "+employee3.get_employeeId()+" "+employee3.get_department()+" "+employee3.get_position());

	}
}
