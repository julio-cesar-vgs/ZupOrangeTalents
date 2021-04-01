package br.com.zup.orangetalents.vacina.controller

import br.com.zup.orangetalents.vacina.data.entities.Vacina
import br.com.zup.orangetalents.vacina.data.repository.VacinaRepository
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@RestController
@RequestMapping("/vacina")
class VacinaController(val vacinaRepository: VacinaRepository, ) {

    @PostMapping
    fun postVacina(@RequestBody @Valid vacina: Vacina): Vacina {
        val save = vacinaRepository.save(vacina);
        return save;
    }

    @GetMapping
    fun postVacina() =
            vacinaRepository.findAll()
}

