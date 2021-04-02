package br.com.zup.orangetalents.vacina.controller

import br.com.zup.orangetalents.vacina.data.mappers.toDto
import br.com.zup.orangetalents.vacina.domain.models.VacinaDto
import br.com.zup.orangetalents.vacina.domain.service.VacinaService
import br.com.zup.orangetalents.vacina.message.request.VacinaPostRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@RestController
@RequestMapping("/vacina")
class VacinaController(val vacinaService: VacinaService ) {

    @GetMapping
    fun get() = ResponseEntity.ok(vacinaService.get())

    @PostMapping
    fun post(@RequestBody @Valid vacinaPostRequest: VacinaPostRequest): ResponseEntity<VacinaDto?> {
        return ResponseEntity.ok(vacinaService.post(vacinaPostRequest.toDto()))
    }
}

