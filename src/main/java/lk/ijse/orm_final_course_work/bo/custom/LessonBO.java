package lk.ijse.orm_final_course_work.bo.custom;

import lk.ijse.orm_final_course_work.bo.SuperBO;
import lk.ijse.orm_final_course_work.dto.LessonDTO;

import java.util.List;

public interface LessonBO extends SuperBO {

    void saveLesson(LessonDTO dto);
    void updateLesson(LessonDTO dto);
    void deleteLesson(LessonDTO dto);
    LessonDTO getLesson(String lessonId);
    List<LessonDTO> getAllLesson();
    String generateNextLessonId();
}
