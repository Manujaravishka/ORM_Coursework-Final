package lk.ijse.orm_final_course_work.dao.custom;

import lk.ijse.orm_final_course_work.dao.SuperDAO;
import lk.ijse.orm_final_course_work.entity.Payment;

import java.util.List;

public interface PaymentDAO extends SuperDAO {
    boolean save(Payment payment);

    boolean update(Payment payment);

    boolean delete(String id);

    Payment findById(String id);

    List<Payment> findAll();

    String generatePaymentId();
}
