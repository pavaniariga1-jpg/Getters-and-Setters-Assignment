package package_example;

public class Employee {
	    private int employeeid;
		private String employeeName;
		private double monthlySalary;
		//getter and setter for employed
		public void setEmployeeId(int employeeid) {
			this.employeeid=employeeid;
		}
		public int getEmployeeId() {
			return employeeid;
		}
		//getter and setter for employeeName 
		public void setEmployeeName(String employeeName) {
			this.employeeName=employeeName;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		//getter and setter for monthly Salary
		public void setMonthlySalary(double monthlySalary) {
			this.monthlySalary=monthlySalary;
		}
		public double getmonthlySalary() {
			return monthlySalary;
		}
		//business method
		public double AnnualSalary() {
			return monthlySalary*12;
		}
	    //Display method
		public void displaydetails() {
			System.out.println("Employee Id:"+employeeid +
					           "Employee Name:"+employeeName +
					           "Monthly Salary: "+monthlySalary +
					           "Annual Salary: "+AnnualSalary());
		}
		

	}
