package br.com.zup.orangetalents.vacina.controller

import br.com.zup.orangetalents.vacina.mappers.toDto
import br.com.zup.orangetalents.vacina.mappers.toResponse
import br.com.zup.orangetalents.vacina.message.request.VacinaPostRequest
import br.com.zup.orangetalents.vacina.message.response.VacinaPostResponse
import br.com.zup.orangetalents.vacina.service.VacinaService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@RestController
@RequestMapping("/vacina")
class VacinaController(val vacinaService: VacinaService) {

    @GetMapping
    fun get() = ResponseEntity.ok(vacinaService.get())

    @PostMapping
    fun post(@RequestBody @Valid vacinaPostRequest: VacinaPostRequest): ResponseEntity<VacinaPostResponse?> {
        return ResponseEntity.ok(vacinaService.post(vacinaPostRequest.toDto()).toResponse())
    }
}

