package lk.ijse.orm_final_course_work.entity;




import lk.ijse.orm_final_course_work.dto.LessonDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="student")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student {
    @Id
    private Long id;
    private int studentID;
    private String studentName;
    private String studentEmail;
    private String contactNO;
    private String address;
    private LocalDate dateOfBirth;
    private LocalDate registrationDate;
    @ManyToMany(mappedBy = "studentList")
    private List<Course> courses;
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Lessons> lessons;
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Payment>  payments;
}
