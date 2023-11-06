package factory;

public class FullTimeEmployee extends Employee {
	private double hourlyRate;
	
	public FullTimeEmployee(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public double getHourlyRate() {
		System.out.println("This is Full Time Employee");
		return hourlyRate;
	}

}
