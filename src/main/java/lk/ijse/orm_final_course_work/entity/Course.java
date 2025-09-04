package lk.ijse.orm_final_course_work.entity;

import edu.ijse.dto.StudentDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="course")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseID;
    private String courseName;
    private String Duration;
    private BigDecimal fee;
    @ManyToMany
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )//this is many to many with student , hehe
    private List<Student> studentList;
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Lessons> lessonsList;
    @ManyToMany
    @JoinTable(
            name="course_instructor",joinColumns =@JoinColumn(name="course_id"),
            inverseJoinColumns = @JoinColumn(name="instructor_id"))//this is mny to many with instructor
    private List<Instructor> instructorList;
}
