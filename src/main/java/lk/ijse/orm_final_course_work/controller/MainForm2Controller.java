package lk.ijse.orm_final_course_work.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MainForm2Controller {

    @FXML
    private JFXButton btnDashboard;

    @FXML
    private JFXButton btnProgram;

    @FXML
    private JFXButton btnSetting;

    @FXML
    private JFXButton btnStudent;

    @FXML
    private JFXButton btnView;

    @FXML
    private JFXButton btnInstructor;

    @FXML
    private JFXButton btnPayment;

    @FXML
    private JFXButton btnLessons;

    @FXML
    private AnchorPane changeForm;

    @FXML
    private AnchorPane dashboardFrom;

    public void initialize() {
        loadForm("/dashboard.fxml", btnDashboard);
    }

    @FXML
    void btnDashboardOnAction(ActionEvent event) {
        loadForm("/dashboard.fxml", btnDashboard);
    }

    @FXML
    void btnProgramOnAction(ActionEvent event) {
        loadForm("/programForm.fxml", btnProgram);
    }

    @FXML
    void btnStudentOnAction(ActionEvent event) {
        loadForm("/studentForm.fxml", btnStudent);
    }

    @FXML
    void btnInstructorOnAction(ActionEvent event) {
        loadForm("/instructorForm.fxml", btnInstructor);
    }

    @FXML
    void btnPaymentOnAction(ActionEvent event) {
        loadForm("/PaymentTableForm.fxml", btnPayment);
    }

    @FXML
    void btnLessonsOnAction(ActionEvent event) {
        loadForm("/lessonForm.fxml", btnLessons);
    }

    @FXML
    void btnSettingOnAction(ActionEvent event) {
        loadForm("/settingForm.fxml", btnSetting);
    }

    @FXML
    void btnViewOnAction(ActionEvent event) {
        // Optional action
    }

    @FXML
    void logOutAction(MouseEvent event) {
        try {
            URL resource = getClass().getResource("/loginForm.fxml");
            if (resource == null) {
                System.err.println("Login FXML not found!");
                return;
            }
            Scene scene = new Scene(FXMLLoader.load(resource));
            Stage stage = (Stage) dashboardFrom.getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** Safe form loader */
    private void loadForm(String fxmlPath, JFXButton activeButton) {
        try {
            URL resource = getClass().getResource(fxmlPath);
            if (resource == null) {
                System.err.println("FXML file not found: " + fxmlPath);
                return;
            }
            Node loadedForm = FXMLLoader.load(resource);
            changeForm.getChildren().setAll(loadedForm);
            resetButtonStyles();
            highlightButton(activeButton);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** Highlight active button */
    private void highlightButton(JFXButton button) {
        if (button != null) {
            button.setStyle("-fx-background-color: #468A9A; -fx-text-fill: #FFFFFF; "
                    + "-fx-border-color: #FFFFFF; -fx-border-width: 3; "
                    + "-fx-border-radius: 5; -fx-background-radius: 10;");
        }
    }

    /** Null-safe reset button styles */
    private void resetButtonStyles() {
        String style = "-fx-background-color: #26667F; -fx-text-fill: #000000; "
                + "-fx-border-color: #FFFFFF; -fx-border-width: 3; "
                + "-fx-border-radius: 5; -fx-background-radius: 10;";

        if (btnDashboard != null) btnDashboard.setStyle(style);
        if (btnProgram != null) btnProgram.setStyle(style);
        if (btnStudent != null) btnStudent.setStyle(style);
        if (btnInstructor != null) btnInstructor.setStyle(style);
        if (btnPayment != null) btnPayment.setStyle(style);
        if (btnLessons != null) btnLessons.setStyle(style);
        if (btnSetting != null) btnSetting.setStyle(style);
        if (btnView != null) btnView.setStyle(style);
    }
}
