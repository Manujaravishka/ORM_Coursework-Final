package lk.ijse.orm_final_course_work.dao.custom;

import lk.ijse.orm_final_course_work.dao.SuperDAO;
import lk.ijse.orm_final_course_work.entity.User;
import lk.ijse.orm_final_course_work.exception.UserAlreadyExistsException;

import java.util.List;

public interface UserDAO extends SuperDAO {
    void save(User user) throws UserAlreadyExistsException;

    void update(User user);

    void delete(User user);

    User getUser(String userName);

    List<User> getAllUsers();
}
