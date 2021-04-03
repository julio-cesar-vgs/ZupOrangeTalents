package br.com.zup.orangetalents.vacina.service

import br.com.zup.orangetalents.vacina.dtos.VacinaDto
import br.com.zup.orangetalents.vacina.mappers.toDto
import br.com.zup.orangetalents.vacina.mappers.toEntity
import br.com.zup.orangetalents.vacina.repository.VacinaRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class VacinaService(val vacinaRepository: VacinaRepository) : IServiceGenerics<VacinaDto> {
    override fun get() =
            vacinaRepository.findAll().map { it.toDto() }

    override fun post(t: VacinaDto) =
        vacinaRepository.save(t.toEntity()).toDto()


    override fun getById(id: Long): Optional<VacinaDto> {
        return vacinaRepository.findById(id).map { it.toDto() }
    }
}

