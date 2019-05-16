package main;

import Controler.StudentControler;
import Model.StudentModel;
import View.StudentView;

public class Main {

	public static void main(String[] args) {
		//fetch student record based on his roll no from the database
		StudentModel model = retriveStudentFromDatabase();
		//Create a view : to write student details on console
		StudentView view = new StudentView();
		StudentControler controler = new StudentControler(model, view);
		controler.updateView();
		//update model data
		controler.setStudentName("Johny");
		controler.setStudentRollN("90909087979797979");
		controler.updateView();
		
		

	}

	private static StudentModel retriveStudentFromDatabase() {
		StudentModel student = new StudentModel();
		student.setName("Roberto");
		student.setRollNum("879797979797963131313");
		return student;
	}

}
