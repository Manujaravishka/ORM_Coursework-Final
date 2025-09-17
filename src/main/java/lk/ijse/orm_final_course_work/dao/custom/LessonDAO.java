package lk.ijse.orm_final_course_work.dao.custom;

import lk.ijse.orm_final_course_work.dao.SuperDAO;
import lk.ijse.orm_final_course_work.entity.Lesson;

import java.util.List;

public interface LessonDAO extends SuperDAO {
    void saveLesson(Lesson lesson);

    void updateLesson(Lesson lesson);

    void deleteLesson(Lesson lesson);

    List<Lesson> getAllLesson();

    Lesson getLesson(String lessonId);

    String getLastLessonId();
}
