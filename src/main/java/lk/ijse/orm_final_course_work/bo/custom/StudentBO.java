package lk.ijse.orm_final_course_work.bo.custom;

import lk.ijse.orm_final_course_work.bo.SuperBO;
import lk.ijse.orm_final_course_work.dto.StudentDTO;

import java.util.List;

public interface StudentBO extends SuperBO {


    void saveStudent(StudentDTO dto);
    void updateStudent(StudentDTO dto);
    void deleteStudent(StudentDTO dto);
    StudentDTO getStudent(String studentId);
    List<StudentDTO> getAllStudent();
    String generateNewId();


}
