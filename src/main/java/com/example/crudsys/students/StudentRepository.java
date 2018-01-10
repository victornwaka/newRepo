package com.example.crudsys.students;

import java.util.List;

import com.example.crudsys.model.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Persons, Long> {

    List<Persons> findAll();

    List<Persons> findByFirstName(String firstName);
}
