package info.fekri.spring_starter1.repository

import info.fekri.spring_starter1.model.Student
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository: CrudRepository<Student, String> {
}