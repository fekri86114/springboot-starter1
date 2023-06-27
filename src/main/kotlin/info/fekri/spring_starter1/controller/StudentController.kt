package info.fekri.spring_starter1.controller

import info.fekri.spring_starter1.model.Student
import info.fekri.spring_starter1.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController {
    private lateinit var studentRepository: StudentRepository

    @Autowired
    fun set_student_repository(studentRepo: StudentRepository) {
        studentRepository = studentRepo
    }

    @GetMapping("/students")
    fun getAllStudents(): ResponseEntity<MutableIterable<Student>> {
        return ResponseEntity.ok(studentRepository.findAll())
    }

}