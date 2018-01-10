package com.example.crudsys.students;

import com.example.crudsys.model.Persons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/com/example/crudsys/students")
public class StudentController {

    private StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(method=RequestMethod.GET)
    List<Persons> GetAllStudents() {
        return studentService.GetAllStudents();
    }

    @RequestMapping(value="/{matric_no}", method=RequestMethod.GET)
    Persons GetStudentByMatric(@PathVariable Long matric_no) {
        return studentService.GetStudentByMatricNo(matric_no);
    }

    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<?> add(@RequestBody Persons persons) {
        return ResponseEntity.ok(studentService.CreateStudent(persons));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ResponseEntity<?> update(@RequestBody Persons persons) {
        return ResponseEntity.ok(studentService.UpdateStudent(persons));
    }

    @RequestMapping(value = "/delete-user/{matric_no}",method = RequestMethod.DELETE)
    ResponseEntity<String> delete(@PathVariable Long matric_no) {
        return ResponseEntity.ok(studentService.DeleteStudent(matric_no));
    }
}

