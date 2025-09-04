module lk.ijse.orm_final_course_work {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires static lombok;


    opens lk.ijse.orm_final_course_work to javafx.fxml;
    exports lk.ijse.orm_final_course_work;
}