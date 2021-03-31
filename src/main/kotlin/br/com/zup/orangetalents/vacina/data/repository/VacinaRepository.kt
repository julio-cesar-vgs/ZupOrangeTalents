package br.com.zup.orangetalents.vacina.data.repository

import br.com.zup.orangetalents.vacina.data.entities.Vacina
import org.springframework.data.repository.CrudRepository

interface VacinaRepository: CrudRepository<Vacina, Long> {
}
