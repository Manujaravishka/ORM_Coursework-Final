package lk.ijse.orm_final_course_work.bo.custom;

import lk.ijse.orm_final_course_work.dto.UserDTO;

import java.io.InvalidClassException;

public interface LoginBO {
    UserDTO getUser(String username) throws InvalidClassException;
}
