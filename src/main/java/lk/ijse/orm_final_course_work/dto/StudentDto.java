package lk.ijse.orm_final_course_work.dto;

import lk.ijse.orm_final_course_work.entity.Course;

import java.time.LocalDate;
import java.util.List;

public class StudentDto {
    private int studentID;
    private String studentName;
    private String studentEmail;
    private String contactNO;
    private String address;
    private LocalDate dateOfBirth;
    private LocalDate registrationDate;
    private List<Course> courses;
    private List<LessonDto> lessons;
}
