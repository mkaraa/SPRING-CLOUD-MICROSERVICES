package com.example.studentservice.model.response;

import com.example.studentservice.model.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class StudentResponse {
    private Long id;
    private String name;
    private String email;

    private AddressResponse addressId;

    public StudentResponse(Student student){
        this.id = student.getId();
        this.name = student.getName();
        this.email = student.getEmail();
    }
}
