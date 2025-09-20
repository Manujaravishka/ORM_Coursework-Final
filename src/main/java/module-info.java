module lk.ijse.orm_final_course_work {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires java.naming;

    requires jbcrypt;
    requires mysql.connector.j;
    requires org.hibernate.orm.core;
    requires com.jfoenix;
    requires static lombok;

    exports lk.ijse.orm_final_course_work;

    opens lk.ijse.orm_final_course_work.controller to javafx.fxml;
    opens lk.ijse.orm_final_course_work to javafx.fxml;

    // Add this line:
    opens lk.ijse.orm_final_course_work.entity to org.hibernate.orm.core;
}
