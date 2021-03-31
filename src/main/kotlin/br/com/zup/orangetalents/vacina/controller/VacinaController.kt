package br.com.zup.orangetalents.vacina.controller

import br.com.zup.orangetalents.vacina.domain.models.UsuarioDomain
import br.com.zup.orangetalents.vacina.data.entities.Usuario
import br.com.zup.orangetalents.vacina.data.entities.Vacina
import br.com.zup.orangetalents.vacina.data.mappers.toDomain
import br.com.zup.orangetalents.vacina.data.repository.VacinaRepository
import br.com.zup.orangetalents.vacina.request.UsuarioRequest
import br.com.zup.orangetalents.vacina.service.IService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController("/")
class VacinaController(val usuarioService: IService<UsuarioDomain>, val vacinaRepository: VacinaRepository) {

    @GetMapping("/usuario")
    fun get() = usuarioService.get()

    @PostMapping("/usuario")
    fun post(@RequestBody @Valid usuario: UsuarioRequest): Usuario {

        val post = usuarioService.post(usuario.toDomain())
        return post
    }

    @PostMapping("/vacina")
    fun postVacina(@RequestBody @Valid vacina: Vacina): Vacina {
        val save = vacinaRepository.save(vacina);
        return save;
    }

    @GetMapping("/vacina")
    fun postVacina() =
            vacinaRepository.findAll()
}

