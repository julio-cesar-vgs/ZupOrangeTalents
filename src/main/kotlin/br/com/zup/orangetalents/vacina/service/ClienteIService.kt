package br.com.zup.orangetalents.vacina.service

import br.com.zup.orangetalents.vacina.model.Usuario
import br.com.zup.orangetalents.vacina.repository.ClienteRepository
import org.springframework.stereotype.Service

@Service
class ClienteIService(
        val clienteRepository: ClienteRepository
) : IService<Usuario> {


    override fun get() =
            clienteRepository.findAll().map { it }


    override fun get(id: Long): Usuario {
        TODO("Not yet implemented")
    }

    override fun put() {
        TODO("Not yet implemented")
    }

    override fun delete() {
        TODO("Not yet implemented")
    }

    override fun post(t: Usuario): Usuario {
        val findById = clienteRepository.findById(t.id)
        if (findById.isPresent) {
            throw IllegalAccessException("teste")
        }
        return clienteRepository.save(t)
    }
}
