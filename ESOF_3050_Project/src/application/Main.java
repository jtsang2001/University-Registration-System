/*
 * ESOF 3050 Project
 * 
 * Nicholas Imperius
 * Sukhraj Deol
 * Jimmy Tsang
 * Kristopher Poulin
 * 
 * Main.java
 */

package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class Main extends Application {
	
	//Global Variables, required to pass the memberID between functions
	String memberID;
	RegisterForCoursesController registerForCoursesController;
	ViewCoursesController viewCoursesController;
	StudentWelcomeScreenController studentWelcomeScreenController;
	InstructorWelcomeScreenController instructorWelcomeScreenController;
	AdminWelcomeScreenController adminWelcomeScreenController;
	DropCoursesController dropCoursesController;

	// Primary Stage
    Stage stage;
    
    //Scenes for each UI screen
    Scene sceneLogin;
    Scene sceneAddCourse;
    Scene sceneAddEmployee;
    Scene sceneDropCourses;
    Scene sceneEmployeeList;
    Scene sceneViewCourses;
    Scene sceneModifyGrades;
    Scene sceneRegisterCourse;
    Scene scenesStudentList;
    Scene sceneSearchCourses;
    Scene sceneRemoveEmployee;
    Scene sceneRemoveCourse;
    Scene sceneStudentWelcomeScreen;
    Scene sceneInstructorWelcomeScreen;
    Scene sceneAdminWelcomeScreen;
    
    // The panes are associated with the respective .fxml files
    private Pane paneLogin;
    private Pane paneAddCourse;
    private Pane paneAddEmployee;
    private Pane paneDropCourses;
    private Pane paneEmployeeList;
    private Pane paneViewCourses;
    private Pane paneModifyGrades;
    private Pane paneRegisterCourse;
    private Pane paneStudentList;
    private Pane paneSearchCourses;
    private Pane paneRemoveEmployee;
    private Pane paneRemoveCourse;
    private Pane paneStudentWelcomeScreen;
    private Pane paneInstructorWelcomeScreen;
    private Pane paneAdminWelcomeScreen;
	
    /**
     * Starts the interface
     */
	@Override
	public void start(Stage mainStage) throws Exception {
		try {
			//Set stage as main stage
			stage = mainStage;
			
			//Load the FXML's and their specific controller classes
			FXMLLoader fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(Main.class.getResource("login.fxml"));
			paneLogin = fxmlloader.load();
			LoginController loginController = fxmlloader.getController();
			
			fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(Main.class.getResource("addCourse.fxml"));
			paneAddCourse = fxmlloader.load();
			AddCourseController addCourseController = fxmlloader.getController();
			
			fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(Main.class.getResource("addEmployee.fxml"));
			paneAddEmployee = fxmlloader.load();
			AddEmployeeController addEmployeeController = fxmlloader.getController();
			
			fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(Main.class.getResource("dropCourses.fxml"));
			paneDropCourses = fxmlloader.load();
			dropCoursesController = fxmlloader.getController();
			
			fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(Main.class.getResource("employeeList.fxml"));
			paneEmployeeList = fxmlloader.load();
			EmployeeListController employeeListController = fxmlloader.getController();
			
			fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(Main.class.getResource("enrolledCoursesViewGradesViewActiveCourses.fxml"));
			paneViewCourses = fxmlloader.load();
			viewCoursesController = fxmlloader.getController();
			
			fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(Main.class.getResource("modifyGrades.fxml"));
			paneModifyGrades = fxmlloader.load();
			ModifyGradesController modifyGradesController = fxmlloader.getController();
			
			fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(Main.class.getResource("registerCourse.fxml"));
			paneRegisterCourse = fxmlloader.load();
			registerForCoursesController = fxmlloader.getController();
			
			fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(Main.class.getResource("studentList.fxml"));
			paneStudentList = fxmlloader.load();
			StudentListController studentListController = fxmlloader.getController();
			
			fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(Main.class.getResource("searchCourses.fxml"));
			paneSearchCourses = fxmlloader.load();
			SearchCoursesController searchCoursesController = fxmlloader.getController();
			
			fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(Main.class.getResource("removeEmployee.fxml"));
			paneRemoveEmployee = fxmlloader.load();
			RemoveEmployeeController removeEmployeeController = fxmlloader.getController();
			
			fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(Main.class.getResource("removeCourse.fxml"));
			paneRemoveCourse = fxmlloader.load();
			RemoveCourseController removeCourseController = fxmlloader.getController();
			
			fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(Main.class.getResource("optionScreenStud.fxml"));
			paneStudentWelcomeScreen = fxmlloader.load();
			studentWelcomeScreenController = fxmlloader.getController();
			
			fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(Main.class.getResource("optionScreenInstr.fxml"));
			paneInstructorWelcomeScreen = fxmlloader.load();
			instructorWelcomeScreenController = fxmlloader.getController();
			
			fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(Main.class.getResource("optionScreenAdmin.fxml"));
			paneAdminWelcomeScreen = fxmlloader.load();
			adminWelcomeScreenController = fxmlloader.getController();
			
			//Set Scenes to the loaded FXML's
			Scene sceneLogin = new Scene(paneLogin);
			Scene sceneAddCourse = new Scene(paneAddCourse);
			Scene sceneAddEmployee = new Scene(paneAddEmployee);
			Scene sceneDropCourses = new Scene(paneDropCourses);
			Scene sceneEmployeeList = new Scene(paneEmployeeList);
			Scene sceneViewCourses = new Scene(paneViewCourses);
			Scene sceneModifyGrades = new Scene(paneModifyGrades);
			Scene sceneRegisterCourse = new Scene(paneRegisterCourse);
			Scene sceneStudentList = new Scene(paneStudentList);
			Scene sceneSearchCourses = new Scene(paneSearchCourses);
			Scene sceneRemoveEmployee = new Scene(paneRemoveEmployee);
			Scene sceneRemoveCourse = new Scene(paneRemoveCourse);
			Scene sceneStudentWelcomeScreen = new Scene(paneStudentWelcomeScreen);
			Scene sceneInstructorWelcomeScreen = new Scene(paneInstructorWelcomeScreen);
			Scene sceneAdminWelcomeScreen = new Scene(paneAdminWelcomeScreen);
			
			//Pass Reference to their controller classes
			//	Allows us to send the what the next scene would be so that when a button is pressed we can easily swap to that scene
			loginController.setMainScene(this, memberID);
			loginController.setLoginPressScene(sceneStudentWelcomeScreen, sceneAdminWelcomeScreen, sceneInstructorWelcomeScreen);
			
			addCourseController.setMainScene(this);
			addCourseController.setBackPressedScene(sceneAdminWelcomeScreen);
			
			addEmployeeController.setMainScene(this);
			addEmployeeController.setBackPressedScene(sceneAdminWelcomeScreen);
			
			dropCoursesController.setMainScene(this);
			dropCoursesController.setBackPressedScene(sceneStudentWelcomeScreen);
			
			employeeListController.setMainScene(this);
			employeeListController.setBackPressedScene(sceneAdminWelcomeScreen, sceneInstructorWelcomeScreen);
			
			viewCoursesController.setMainScene(this);
			viewCoursesController.setBackPressedScene(sceneAdminWelcomeScreen, sceneInstructorWelcomeScreen, sceneStudentWelcomeScreen);
			
			modifyGradesController.setMainScene(this);
			modifyGradesController.setBackPressedScene(sceneInstructorWelcomeScreen);
			
			registerForCoursesController.setMainScene(this);
			registerForCoursesController.setBackPressedScene(sceneStudentWelcomeScreen);
			
			studentListController.setMainScene(this);
			studentListController.setBackPressedScene(sceneAdminWelcomeScreen, sceneInstructorWelcomeScreen);
			
			searchCoursesController.setMainScene(this);
			searchCoursesController.setBackPressedScene(sceneStudentWelcomeScreen);
			
			removeEmployeeController.setMainScene(this);
			removeEmployeeController.setBackPressedScene(sceneAdminWelcomeScreen);
			
			removeCourseController.setMainScene(this);
			removeCourseController.setBackPressedScene(sceneAdminWelcomeScreen);
			
			//Set the different controllers within the system
			studentWelcomeScreenController.setMainScene(this);
			studentWelcomeScreenController.setLogoutPressedScene(sceneLogin);
			studentWelcomeScreenController.setDropCoursesPressedScene(sceneDropCourses);
			studentWelcomeScreenController.setRegisterCoursesPressedScene(sceneRegisterCourse);
			studentWelcomeScreenController.setSearchCoursesPressedScene(sceneSearchCourses);
			studentWelcomeScreenController.setViewCoursesPressedScene(sceneViewCourses);
			studentWelcomeScreenController.setViewGradesPressedScene(sceneViewCourses);
			studentWelcomeScreenController.setViewCoursesController(viewCoursesController);
			studentWelcomeScreenController.setDropCoursesController(dropCoursesController);
			
			instructorWelcomeScreenController.setMainScene(this);
			instructorWelcomeScreenController.setEmployeeListPressedScene(sceneEmployeeList);
			instructorWelcomeScreenController.setLogoutPressedScene(sceneLogin);
			instructorWelcomeScreenController.setModifyGradesPressedScene(sceneModifyGrades);
			instructorWelcomeScreenController.setStudentListPressedScene(sceneStudentList);
			instructorWelcomeScreenController.setViewActiveCoursesPressedScene(sceneViewCourses);
			instructorWelcomeScreenController.setViewCoursesController(viewCoursesController);
			instructorWelcomeScreenController.setEmployeeListController(employeeListController);
			instructorWelcomeScreenController.setStudentListController(studentListController);
			instructorWelcomeScreenController.setModifyGradesController(modifyGradesController);
			
			adminWelcomeScreenController.setMainScene(this);
			adminWelcomeScreenController.setAddCoursePressedScene(sceneAddCourse);
			adminWelcomeScreenController.setAddEmployeePressedScene(sceneAddEmployee);
			adminWelcomeScreenController.setEmployeeListPressedScene(sceneEmployeeList);
			adminWelcomeScreenController.setLogoutPressedScene(sceneLogin);
			adminWelcomeScreenController.setRemoveCoursePressedScene(sceneRemoveCourse);
			adminWelcomeScreenController.setRemoveEmployeePressedScene(sceneRemoveEmployee);
			adminWelcomeScreenController.setStudentListPressedScene(sceneStudentList);
			adminWelcomeScreenController.setViewActiveCoursesPressedScene(sceneViewCourses);
			adminWelcomeScreenController.setViewCoursesController(viewCoursesController);	
			adminWelcomeScreenController.setEmployeeListController(employeeListController);
			adminWelcomeScreenController.setStudentListController(studentListController);
			adminWelcomeScreenController.setAddCourseController(addCourseController);
			adminWelcomeScreenController.setAddEmployeeController(addEmployeeController);
			adminWelcomeScreenController.setRemoveCourseController(removeCourseController);
			adminWelcomeScreenController.setRemoveEmployeeController(removeEmployeeController);
			adminWelcomeScreenController.loadInstructorsPre();
			
			//Finally, set the initial UI screen that the user sees
			stage.setScene(sceneLogin);
			stage.setTitle("Univeristy Registration System");
			stage.show();
			
		} 
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	/**
	 * Sets the scene
	 * 
	 * @param sc Scene to be set to
	 */
	public void setScreen(Scene sc) {
		stage.setScene(sc);
	}
	/**
	 * Function to set the memberID in the welcome screen controllers so that it can be passed along to the necessary
	 * screen to be used in the queries
	 * 
	 * @param memberID The memberID of the user logging in 
	 */
	public void setMemberID(String memberID) {
		registerForCoursesController.setMemberID(memberID);
		studentWelcomeScreenController.setMemberID(memberID);
		instructorWelcomeScreenController.setMemberID(memberID);
		adminWelcomeScreenController.setMemberID(memberID);
		dropCoursesController.setMemberID(memberID);
	}
	
	/**
	 * Main Function
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
