package lk.ijse.orm_final_course_work.dto;

import lk.ijse.orm_final_course_work.entity.Course;
import lk.ijse.orm_final_course_work.entity.Student;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PaymentDto {
    private int paymentId;
    private LocalDate paymentDate;
    private String paymentType;
    private BigDecimal paymentAmount;
    private Boolean status;

    private Course course;
    private Student student;
}
