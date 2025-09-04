package lk.ijse.orm_final_course_work.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="payment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentId;
    private LocalDate paymentDate;
    private String paymentType;
    private BigDecimal paymentAmount;
    private Boolean status;
    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;
}
