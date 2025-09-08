package lk.ijse.orm_final_course_work.bo.custom.impl;

import lk.ijse.orm_final_course_work.bo.custom.LoginBO;
import lk.ijse.orm_final_course_work.dao.Custom.UserDAO;
import lk.ijse.orm_final_course_work.dao.DAOFactory;

public class LoginBOImpl implements LoginBO {

    UserDAO userDAO = (UserDAO) DAOFactory.getDAO(DAOFactory.DAOType.USER);

    @Override
    public UserDTO getUser(String userName) throws InvalidCredentialsException {
        try {
            User user = userDAO.getUser(userName);
            return new UserDTO(user.getUserId(),user.getUserName(),user.getPassword(),user.getRole());
        } catch (Exception e) {
            throw new InvalidCredentialsException(e.getMessage());
        }
    }
}
