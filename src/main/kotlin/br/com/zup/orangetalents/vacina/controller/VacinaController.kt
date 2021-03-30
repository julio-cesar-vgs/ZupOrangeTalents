package br.com.zup.orangetalents.vacina.controller

import br.com.zup.orangetalents.vacina.model.User
import br.com.zup.orangetalents.vacina.service.IService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController("/")
class VacinaController(val userService: IService<User>) {

    @GetMapping
    fun get() = userService.get()

    @PostMapping
    fun post(@RequestBody @Valid user: User): User {
        val post = userService.post(user)
        return post
    }


}

