package br.com.zup.orangetalents.vacina.controller

import br.com.zup.orangetalents.vacina.data.entities.Vacina
import br.com.zup.orangetalents.vacina.data.mappers.toDto
import br.com.zup.orangetalents.vacina.data.repository.VacinaRepository
import br.com.zup.orangetalents.vacina.domain.models.UsuarioDto
import br.com.zup.orangetalents.vacina.domain.models.VacinaDto
import br.com.zup.orangetalents.vacina.domain.service.VacinaService
import br.com.zup.orangetalents.vacina.message.request.UsuarioPostRequest
import br.com.zup.orangetalents.vacina.message.request.VacinaPostRequest
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@RestController
@RequestMapping("/vacina")
class VacinaController(val vacinaService: VacinaService ) {

    @GetMapping
    fun get() = vacinaService.get()

    @PostMapping
    fun post(@RequestBody @Valid usuarioPost: VacinaPostRequest): VacinaDto {
        return vacinaService.post(usuarioPost.toDto())
    }
}

