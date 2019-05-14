package Controler;

import Model.StudentModel;
import View.StudentView;

public class StudentControler {
	private StudentModel model;
	private StudentView view;
	
	public StudentControler(StudentModel model, StudentView view){
		this.model = model;
		this.view = view;
	}
	public void setStudentName(String name){
		model.setName(name);
	}
	public String getStudentName(){
		return model.getName();
	}
	public void setStudentRollN(String rollNumber){
		model.setRollNum(rollNumber);
	}
	public String getStudentRollN(){
		return model.getRollNum();
	}
	public void updateView(){
		view.printStudentDetails(getStudentName(), getStudentRollN());
	}
}