package br.com.zup.orangetalents.vacina.domain.service

import br.com.zup.orangetalents.vacina.contract.service.IServiceGenerics
import br.com.zup.orangetalents.vacina.data.mappers.toDto
import br.com.zup.orangetalents.vacina.data.mappers.toEntity
import br.com.zup.orangetalents.vacina.data.repository.UsuarioRepository
import br.com.zup.orangetalents.vacina.domain.models.UsuarioDto
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class UsuarioService(
        val usuarioRepository: UsuarioRepository
) : IServiceGenerics<UsuarioDto> {

    override fun get() =
            usuarioRepository.findAll().map { it.toDto() }

    override fun post(t: UsuarioDto): UsuarioDto {
        try {
            return usuarioRepository.save(t.toEntity()).toDto()
        } catch (exc: Exception) {
            throw ResponseStatusException(
                    HttpStatus.BAD_REQUEST, exc.message, exc)
        }
    }

    override fun getById(id: Long) =
            usuarioRepository.findById(id).map { it.toDto() }
}
