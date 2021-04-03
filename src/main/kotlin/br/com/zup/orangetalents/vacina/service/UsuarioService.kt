package br.com.zup.orangetalents.vacina.service

import br.com.zup.orangetalents.vacina.repository.UsuarioRepository
import br.com.zup.orangetalents.vacina.dtos.UsuarioDto
import br.com.zup.orangetalents.vacina.mappers.toDto
import br.com.zup.orangetalents.vacina.mappers.toEntity
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
