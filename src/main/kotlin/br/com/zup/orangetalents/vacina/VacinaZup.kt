package br.com.zup.orangetalents.vacina

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping

@SpringBootApplication
class VacinaZup

fun main(args: Array<String>) {
    runApplication<VacinaZup>(*args)
}
