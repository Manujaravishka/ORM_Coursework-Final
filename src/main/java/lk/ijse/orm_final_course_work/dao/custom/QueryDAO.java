package lk.ijse.orm_final_course_work.dao.custom;

import lk.ijse.orm_final_course_work.dao.SuperDAO;
import lk.ijse.orm_final_course_work.entity.Student;

import java.util.List;

public interface QueryDAO extends SuperDAO {
    List<Student> getAllProgramsStudent();

    List<Object[]> getAllEqualByProgramName(String programName);
}
