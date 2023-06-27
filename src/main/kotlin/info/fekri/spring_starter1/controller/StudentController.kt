package info.fekri.spring_starter1.controller

import com.google.gson.Gson
import info.fekri.spring_starter1.model.Student
import info.fekri.spring_starter1.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
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

    @PostMapping("/students")
    fun insertStudent(@RequestBody data: String): ResponseEntity<String> {

        val gson = Gson()
        val newStudent = gson.fromJson<Student>(data, Student::class.java)

        studentRepository.save(newStudent)

        return ResponseEntity.ok("sucess")
    }

}