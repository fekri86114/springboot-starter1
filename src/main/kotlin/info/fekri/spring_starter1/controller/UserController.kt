package info.fekri.spring_starter1.controller

import info.fekri.spring_starter1.model.Student
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class UserController {

    @RequestMapping(value = ["/login"], method = [RequestMethod.GET])
    fun openLoginPage(): String = "login"

    @RequestMapping(value = ["/logout"], method = [RequestMethod.GET])
    fun openLogoutPage() : String = "logout"

    fun test() {
        val data = Student()
    }

}