package lk.ijse.orm_final_course_work.bo.custom;

import lk.ijse.orm_final_course_work.bo.SuperBO;
import lk.ijse.orm_final_course_work.dto.UserDTO;
import lk.ijse.orm_final_course_work.exception.UserAlreadyExistsException;
public interface SignUpBO extends SuperBO {

    void signUp(UserDTO userDTO) throws UserAlreadyExistsException;
}
