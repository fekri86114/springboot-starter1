package info.fekri.spring_starter1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class SpringStarter1Application

fun main(args: Array<String>) {
	runApplication<SpringStarter1Application>(*args)
}
