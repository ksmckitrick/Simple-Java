public class payroll {

		private int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
		private int[] hours = new int[7];
		private double[] payRate = new double[7];
		private double[] wages = new double[7];
		
		public void calculateWages()
		
		{
			wages = new double[7];
			
			for (int index = 0; index < 7; index++) {
				wages[index]=hours[index]*payRate[index];
			}
		}
		
		public int getEmployeeId(int index) {
			return employeeId[index];
		}
		
		public int[] getHours() {
			return hours;
		}
		
		public int getHours(int index) {
			return hours[index];
		}
		
		public double[] getPayRate() {
			return payRate;
		}
		
		public double getPayRate(int index) {
			return payRate[index];
		}
		
		public double getWage(int id)
		{
			for (int index = 0; index < 7; index++) {
				
				if (id == employeeId[index]) {
					
					return wages[id];
				}
			}
			return -1;
		}
		
		public double[] getWages() {
			return wages;
		}
		
		public double getWages(int index) {
			return wages[index];
		}
		
		public void setEmployeeId(int index, int employeeId) {
			this.employeeId[index] = employeeId; 
		}
		
		public void setHours(int index, int hours) {
			this.hours[index] = hours;
		}
		
		public void setPayRate(int index, double payRate) {
			this.payRate[index] = payRate;
		}
		
		public void setWages(int index, double wages) {
			this.wages[index] = wages;
		}
		
	}

