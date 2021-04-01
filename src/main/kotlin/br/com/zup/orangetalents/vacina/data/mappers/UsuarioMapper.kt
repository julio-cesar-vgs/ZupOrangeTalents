package br.com.zup.orangetalents.vacina.data.mappers

import br.com.zup.orangetalents.vacina.data.entities.Usuario
import br.com.zup.orangetalents.vacina.domain.models.UsuarioDto
import br.com.zup.orangetalents.vacina.message.request.UsuarioPostRequest


fun UsuarioDto.toEntity() = Usuario(id, nome, cpf, email, dataNascimento)
fun Usuario.toDto() = UsuarioDto(id, nome, cpf, email, dataNascimento)
fun UsuarioPostRequest.toDto() = UsuarioDto(nome, cpf, email, dataNascimento)

