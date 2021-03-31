package br.com.zup.orangetalents.vacina.domain.service

import br.com.zup.orangetalents.vacina.domain.models.UsuarioDomain
import br.com.zup.orangetalents.vacina.data.mappers.toDomain
import br.com.zup.orangetalents.vacina.data.mappers.toEntity
import br.com.zup.orangetalents.vacina.data.repository.ClienteRepository
import br.com.zup.orangetalents.vacina.service.IService
import org.springframework.stereotype.Service

@Service
class ClienteIService(
        val clienteRepository: ClienteRepository
) : IService<UsuarioDomain> {


    override fun get() =
            clienteRepository.findAll().map { it.toDomain() }


    override fun get(id: Long): UsuarioDomain {
        TODO("Not yet implemented")
    }

    override fun put() {
        TODO("Not yet implemented")
    }

    override fun delete() {
        TODO("Not yet implemented")
    }

    override fun post(t: UsuarioDomain): UsuarioDomain {
        val findById = clienteRepository.findById(t.id)
        if (findById.isPresent) {
            throw IllegalAccessException("teste")
        }
        return clienteRepository.save(t.toEntity()).toDomain()
    }
}
