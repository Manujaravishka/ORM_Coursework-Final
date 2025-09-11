package lk.ijse.orm_final_course_work.bo.custom.impl;


import lk.ijse.orm_final_course_work.bo.custom.SignUpBO;
import lk.ijse.orm_final_course_work.dao.DAOFactory;
import lk.ijse.orm_final_course_work.dao.custom.UserDAO;
import lk.ijse.orm_final_course_work.dto.UserDTO;
import lk.ijse.orm_final_course_work.entity.User;
import lk.ijse.orm_final_course_work.exception.UserAlreadyExistsException;

import lk.ijse.orm_final_course_work.bo.custom.SettingBO;
import lk.ijse.orm_final_course_work.bo.custom.SignUpBO;

public class SignUpBOImpl implements SignUpBO {

    UserDAO userDAO = (UserDAO) DAOFactory.getDAO(DAOFactory.DAOType.USER);

    @Override
    public void signUp(UserDTO userDTO) throws UserAlreadyExistsException {
        User user = new User(userDTO.getUserName(), userDTO.getPassword(), userDTO.getRole());
        userDAO.save(user);
    }
}
