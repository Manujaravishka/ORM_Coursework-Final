package lk.ijse.orm_final_course_work.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class CourseDto {
    private int courseID;
    private String courseName;
    private String Duration;
    private BigDecimal fee;
    private List<StudentDto> studentList;

    public CourseDto(int courseID, String courseName,String duration, BigDecimal fee)  {
        this.courseID = courseID;
        this.courseName = courseName;
        Duration = duration;
        this.fee = fee;
    }

    public CourseDto() {
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public List<StudentDto> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<StudentDto> studentList) {
        this.studentList = studentList;
    }
}