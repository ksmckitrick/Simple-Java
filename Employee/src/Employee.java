
public class Employee {
	
		private String name;
		private int idNumber;
		private String department;
		private String position;
		
		public Employee () {
			name ="";
			idNumber = 0;
			department = "";
			position = "";
		}
		
		public Employee(String name, int id, String dept, String pos) {
			this.name = name;
			this.idNumber = id;
			this.department = dept;
			this.position = pos;
		}
		
	
		
		public String get_employee_name() {
			
			return name;
		}
		
		public void set_employeeId(int empId) {

			idNumber = empId;

		 }

		 public int get_employeeId() {

			 return idNumber;

		}      

		 public void set_department(String dept) {

			  department = dept;

		}          

		 public String get_department() {

			  return department;

		}

		 public void set_position(String pos) {

			  position = pos;

		 }

		 public String get_position() {

			  return position;

		 }
		 
	

}
		


