package controller;

public class EmployeeTest {
	
	public static void main(String args[]) {
		
		EmployeeModel model = new EmployeeModel();

		model.setName("Lilly Lola");
		model.setId("1");
		
		EmployeeView view = new EmployeeView();
		view.showDetails(model.getName(), model.getId());
		
		EmployeeController controller = new EmployeeController(model, view);
		controller.updateView();
		controller.setEmployeeID("2");
		controller.setEmployeeName("Lola Lilly");
		controller.showDetails();
	}
}
