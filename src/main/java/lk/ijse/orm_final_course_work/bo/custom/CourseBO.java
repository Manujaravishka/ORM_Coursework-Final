package lk.ijse.orm_final_course_work.bo.custom;

import lk.ijse.orm_final_course_work.bo.SuperBO;
import lk.ijse.orm_final_course_work.dto.courseDTO;

import java.util.List;

public interface CourseBO  extends SuperBO {
    void saveCulinaryProgram(courseDTO culinaryProgramDTO);
    void deleteCulinaryProgram(courseDTO culinaryProgramDTO);
    void updateCulinaryProgram(courseDTO culinaryProgramDTO);
    List<courseDTO> getAllCulinaryProgram();
    courseDTO getCulinaryProgram(String programId);
    String generateProgramId(); // new
}
