module lk.ijse.orm_final_course_work {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires lombok;


    exports lk.ijse.orm_final_course_work;
    opens lk.ijse.orm_final_course_work.controller to javafx.fxml;
    opens lk.ijse.orm_final_course_work to javafx.fxml;
}