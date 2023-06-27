package info.fekri.spring_starter1.model

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class Student(
    @Id
    var firstName: String,
    var lastName: String,
    var age: Int,
    var score: Int
) {
    constructor(): this("", "", -1,-1)
}
