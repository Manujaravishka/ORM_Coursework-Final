package lk.ijse.orm_final_course_work.bo.custom;

import lk.ijse.orm_final_course_work.bo.SuperBO;
import lk.ijse.orm_final_course_work.dto.PaymentDTO;
import lk.ijse.orm_final_course_work.dto.StudentDTO;
import lk.ijse.orm_final_course_work.dto.courseDTO;

import java.util.List;

public interface PaymentBO extends SuperBO {

    boolean savePayment(PaymentDTO dto);
    boolean updatePayment(PaymentDTO dto);
    boolean deletePayment(String id);
    PaymentDTO getPayment(String id);
    List<PaymentDTO> getAllPayments();
    String generatePaymentId();

    // Add for loading ComboBoxes
    List<StudentDTO> getAllStudents();
    List<courseDTO> getAllPrograms();
    boolean updateStatus(String paymentId, String newStatus) throws Exception;


}
