package br.com.zup.orangetalents.vacina.domain.service

import br.com.zup.orangetalents.vacina.contract.service.IServiceGenerics
import br.com.zup.orangetalents.vacina.data.mappers.toDto
import br.com.zup.orangetalents.vacina.data.mappers.toEntity
import br.com.zup.orangetalents.vacina.data.repository.UsuarioRepository
import br.com.zup.orangetalents.vacina.domain.models.UsuarioDto
import org.springframework.stereotype.Service

@Service
class UsuarioService(
        val usuarioRepository: UsuarioRepository
) : IServiceGenerics<UsuarioDto> {
    override fun get() =
            usuarioRepository.findAll().map { it.toDto() }

    override fun get(id: Long): UsuarioDto {
        TODO("Not yet implemented")
    }

    override fun put() {
        TODO("Not yet implemented")
    }

    override fun delete() {
        TODO("Not yet implemented")
    }

    override fun post(t: UsuarioDto): UsuarioDto {
        usuarioRepository.findById(t.id)
        return usuarioRepository.save(t.toEntity()).toDto()

    }
}
