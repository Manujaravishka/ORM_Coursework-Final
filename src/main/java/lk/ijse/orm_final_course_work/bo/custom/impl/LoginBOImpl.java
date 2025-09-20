package lk.ijse.orm_final_course_work.bo.custom.impl;

import lk.ijse.orm_final_course_work.bo.custom.LoginBO;
import lk.ijse.orm_final_course_work.dao.DAOFactory;
import lk.ijse.orm_final_course_work.dao.custom.UserDAO;
import lk.ijse.orm_final_course_work.dto.UserDTO;
import lk.ijse.orm_final_course_work.entity.User;
import lk.ijse.orm_final_course_work.exception.InvalidCredentialsException;

public class LoginBOImpl implements LoginBO {

    private final UserDAO userDAO = (UserDAO) DAOFactory.getDAO(DAOFactory.DAOType.USER);

    @Override
    public UserDTO getUser(String userName) throws InvalidCredentialsException {
        try {
            User user = userDAO.getUser(userName);
            if (user == null) {
                throw new InvalidCredentialsException("User not found");
            }
            return new UserDTO(user.getUserId(), user.getUserName(), user.getPassword(), user.getRole());
        } catch (Exception e) {
            throw new InvalidCredentialsException(e.getMessage());
        }
    }
}
