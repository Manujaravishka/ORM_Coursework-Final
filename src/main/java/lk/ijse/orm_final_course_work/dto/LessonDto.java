package lk.ijse.orm_final_course_work.dto;


import lk.ijse.orm_final_course_work.entity.Course;
import lk.ijse.orm_final_course_work.entity.Instructor;

import java.time.LocalDate;
import java.time.LocalTime;

public class LessonDto {
    private int lessonId;
    private String lessonName;
    private LocalDate lessonDate;
    private LocalTime lessonStartTime;
    private LocalTime lessonEndTime;
    private Course course;
    private Instructor instructor;

}