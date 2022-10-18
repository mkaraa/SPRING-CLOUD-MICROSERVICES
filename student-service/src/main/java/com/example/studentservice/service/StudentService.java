package com.example.studentservice.service;

import com.example.studentservice.errorHandler.StudentNotFoundException;
import com.example.studentservice.model.entity.Student;
import com.example.studentservice.model.request.StudentRequest;
import com.example.studentservice.model.response.StudentResponse;
import com.example.studentservice.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    @Transactional
    public StudentResponse create(StudentRequest studentRequest){
        Student student = new Student();
        student.setName(studentRequest.getName());
        student.setEmail(studentRequest.getEmail());
        student.setAddressId(studentRequest.getAddressId());
        studentRepository.save(student);

        return new StudentResponse(student);
    }

    public StudentResponse getById(Long id){
        Student student = studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("Student Not Found With ID : " + id));
        return new StudentResponse(student);
    }
}
