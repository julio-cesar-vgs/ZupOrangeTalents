package br.com.zup.orangetalents.vacina.domain.service

import br.com.zup.orangetalents.vacina.contract.service.IServiceGenerics
import br.com.zup.orangetalents.vacina.data.mappers.toDto
import br.com.zup.orangetalents.vacina.data.mappers.toEntity
import br.com.zup.orangetalents.vacina.data.repository.VacinaRepository
import br.com.zup.orangetalents.vacina.domain.models.VacinaDto
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

