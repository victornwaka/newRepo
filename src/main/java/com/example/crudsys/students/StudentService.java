package com.example.crudsys.students;

import com.example.crudsys.model.Persons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {

    StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    List<Persons>  GetAllStudents()
    {
        return studentRepository.findAll();
    }

    public List<Persons> getPersonByFirstName(String firstName){
        return studentRepository.findByFirstName(firstName);
    }

    Persons GetStudentByMatricNo(Long matNo)
    {
        return studentRepository.findOne(matNo);
    }

    Persons CreateStudent(Persons person)
    {
        studentRepository.save(person);
        return person;
    }

    Persons UpdateStudent(Persons person)
    {
        studentRepository.save(person);
        return person;
    }
    String DeleteStudent(Long matric_no)
    {
        Persons person = studentRepository.findOne(matric_no);
        studentRepository.delete(person);
        return "Student deleted";
    }
}
