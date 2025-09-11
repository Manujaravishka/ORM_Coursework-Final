package lk.ijse.orm_final_course_work.bo.custom.impl;


import lk.ijse.orm_final_course_work.bo.custom.SettingBO;
import lk.ijse.orm_final_course_work.dao.DAOFactory;
import lk.ijse.orm_final_course_work.dao.custom.UserDAO;
import lk.ijse.orm_final_course_work.dto.UserDTO;
import lk.ijse.orm_final_course_work.entity.User;

import java.util.ArrayList;
import java.util.List;


public class SettingBOImpl implements SettingBO {


    UserDAO userDAO = (UserDAO) DAOFactory.getDAO(DAOFactory.DAOType.USER);

    @Override
    public List<UserDTO> getAllUsers() {
        List<UserDTO> userDTOS = new ArrayList<>();
        List<User> allUsers = userDAO.getAllUsers();

        for (User user : allUsers) {
            userDTOS.add(new UserDTO(user.getUserId(), user.getUserName(), user.getPassword(), user.getRole()));
        }
        return userDTOS;
    }

    @Override
    public void deleteUser(UserDTO userDTO){
        User user = new User(userDTO.getUserId(), userDTO.getUserName(), userDTO.getPassword(), userDTO.getRole());
        userDAO.delete(user);
    }

    @Override
    public void updateUser(UserDTO userDTO) {
        User user = new User(userDTO.getUserId(), userDTO.getUserName(), userDTO.getPassword(), userDTO.getRole());
        userDAO.update(user);
    }

}
