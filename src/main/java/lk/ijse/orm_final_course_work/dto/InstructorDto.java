package lk.ijse.orm_final_course_work.dto;

import lk.ijse.orm_final_course_work.entity.Lessons;
import java.util.List;

public class InstructorDto {
    private int instructorID;
    private String instructorName;
    private String instructorEmail;
    private List<LessonDto> lessons;
}