package lk.ijse.orm_final_course_work.bo.custom;

import lk.ijse.orm_final_course_work.bo.SuperBO;
import lk.ijse.orm_final_course_work.dto.StudentDTO;

import java.util.List;

public interface DashboardBO extends SuperBO {

    Long getCulinaryProgramCount();
    Long getStudentCount();
    List<StudentDTO> getAllProgramStudents();
    int getInstructorCount();
}
