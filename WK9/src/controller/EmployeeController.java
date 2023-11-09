package controller;

public class EmployeeController {
	
	private EmployeeModel model;
	private EmployeeView view;
	
	public EmployeeController(EmployeeModel model, EmployeeView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setEmployeeName(String name) {
		model.setName(name);
	}
	
	public void setEmployeeID(String id) {
		model.setId(id);
	}
	
	public String getEmployeeName() {
		return model.getName();
	}
	
	public String getEmployeeId() {
		return model.getId();
	}
	
	public void updateView() {
		view.printEmployeeDetails(model.getName(), model.getId());
	}
	
	public void showDetails() {
		view.showDetails(model.getName(), model.getId());
	}
}
