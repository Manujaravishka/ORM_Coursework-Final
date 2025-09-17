package lk.ijse.orm_final_course_work.bo.custom;

import lk.ijse.orm_final_course_work.bo.SuperBO;
import lk.ijse.orm_final_course_work.dto.UserDTO;

import java.util.List;

public interface SettingBO extends SuperBO {


    List<UserDTO> getAllUsers();
    void deleteUser(UserDTO userDTO);
    void updateUser(UserDTO userDTO);
}
