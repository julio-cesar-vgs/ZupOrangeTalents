package br.com.zup.orangetalents.vacina.repository

import br.com.zup.orangetalents.vacina.model.Vacina
import org.springframework.data.repository.CrudRepository

interface VacinaRepository: CrudRepository<Vacina, Long> {
}
