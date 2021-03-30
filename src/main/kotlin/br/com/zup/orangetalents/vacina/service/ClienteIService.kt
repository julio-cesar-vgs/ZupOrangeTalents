package br.com.zup.orangetalents.vacina.service

import br.com.zup.orangetalents.vacina.model.User
import br.com.zup.orangetalents.vacina.repository.ClienteRepository
import org.springframework.stereotype.Service

@Service
class ClienteIService(
        val clienteRepository: ClienteRepository
) : IService<User> {


    override fun get() =
            clienteRepository.findAll().map { it }


    override fun get(id: Long): User {
        TODO("Not yet implemented")
    }

    override fun put() {
        TODO("Not yet implemented")
    }

    override fun delete() {
        TODO("Not yet implemented")
    }

    override fun post(t: User): User {
        val findById = clienteRepository.findById(t.id)
        if (findById.isPresent) {
            throw IllegalAccessException("teste")
        }
        return clienteRepository.save(t)
    }
}
