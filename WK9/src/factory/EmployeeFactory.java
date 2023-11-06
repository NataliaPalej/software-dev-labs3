package factory;

public class EmployeeFactory {
	
	public static Employee getEmployee(int hoursAllocated, double hourlyRate) {
		// error checking 
		
		if (hoursAllocated >= 40) {
			return new FullTimeEmployee(hourlyRate);
		}
		else {
			return new PartTimeEmployee(hourlyRate);
		}
	}
}
