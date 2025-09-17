package lk.ijse.orm_final_course_work.exception;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String message) {

        super(message);
    }
}
