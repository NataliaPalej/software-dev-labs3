package factory;

public class FactoryTester {
	
	public static void main(String[] args) {
		
		Employee employee = EmployeeFactory.getEmployee(30, 25.0);
		System.out.println("Hourly rate:\t" + "€"+ employee.getHourlyRate());
		
		System.out.println();
		
		Employee employee2 = EmployeeFactory.getEmployee(48, 35.0);
		System.out.println("Hourly rate:\t" + "€"+ employee2.getHourlyRate());	
	}
}
