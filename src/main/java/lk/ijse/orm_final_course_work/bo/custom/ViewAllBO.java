package lk.ijse.orm_final_course_work.bo.custom;

import lk.ijse.orm_final_course_work.bo.SuperBO;
import lk.ijse.orm_final_course_work.dto.courseDTO;

import java.util.List;

public interface ViewAllBO extends SuperBO {


    List<courseDTO> getAllCulinaryProgram();
    List<Object[]> getAllEqualByProgramName(String programName);

}
