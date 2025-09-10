package lk.ijse.orm_final_course_work.bo.custom;

import lk.ijse.orm_final_course_work.bo.SuperBO;
import lk.ijse.orm_final_course_work.dto.InstructorDTO;

import java.util.List;

public interface InstructorBO extends SuperBO {

    boolean saveInstructor(InstructorDTO dto);
    boolean updateInstructor(InstructorDTO dto);
    boolean deleteInstructor(String id);
    InstructorDTO searchInstructor(String id);
    List<InstructorDTO> getAllInstructors();
    String generateNewId();

}
