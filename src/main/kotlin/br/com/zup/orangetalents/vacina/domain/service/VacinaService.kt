package br.com.zup.orangetalents.vacina.domain.service

import br.com.zup.orangetalents.vacina.contract.service.IServiceGenerics
import br.com.zup.orangetalents.vacina.data.mappers.toDto
import br.com.zup.orangetalents.vacina.data.mappers.toEntity
import br.com.zup.orangetalents.vacina.data.repository.VacinaRepository
import br.com.zup.orangetalents.vacina.domain.models.VacinaDto

class VacinaService(val vacinaRepository: VacinaRepository) : IServiceGenerics<VacinaDto> {
    override fun get() =
            vacinaRepository.findAll().map { it.toDto() }

    override fun post(t: VacinaDto): VacinaDto {
        return vacinaRepository.save(t.toEntity()).toDto()
    }

    override fun get(id: Long): VacinaDto {
        TODO("Not yet implemented")
    }

    override fun put() {
        TODO("Not yet implemented")
    }

    override fun delete() {
        TODO("Not yet implemented")
    }
}
