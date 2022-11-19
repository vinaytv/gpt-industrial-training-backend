package net.javaguides.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
