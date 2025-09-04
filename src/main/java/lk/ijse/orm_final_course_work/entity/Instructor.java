package lk.ijse.orm_final_course_work.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Entity
@Table(name="instructor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int instructorID;
    private String instructorName;
    private String instructorEmail;
    @OneToMany(mappedBy ="instructor",cascade = CascadeType.ALL)
    private List<Lessons> lessons;
    @ManyToMany(mappedBy = "instructorList")
    private List<Course> courses;

}