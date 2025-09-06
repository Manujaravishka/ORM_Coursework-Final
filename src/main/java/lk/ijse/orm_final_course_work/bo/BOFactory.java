package lk.ijse.orm_final_course_work.bo;

import lk.ijse.orm_final_course_work.bo.custom.impl.*;
import lk.ijse.orm_final_course_work.bo.custom.impl.LoginBOImpl;

public class BOFactory {

    public enum BOType{
        PROGRAM, STUDENT, DASHBOARD, ADDPROGRAM, VIEWALL, ADDPAYMENT, SIGNUP, LOGIN, SETTING,COURSE,INSTRUCTOR,LESSON,PAYMENT
    }

    public static SuperBO getBO(BOType boType){
        return switch (boType) {

            case LOGIN -> new LoginBOImpl();
            default -> null;
        };
    }
}
