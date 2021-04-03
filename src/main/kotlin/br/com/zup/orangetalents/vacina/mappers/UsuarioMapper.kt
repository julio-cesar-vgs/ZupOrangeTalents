package br.com.zup.orangetalents.vacina.mappers

import br.com.zup.orangetalents.vacina.entities.Usuario
import br.com.zup.orangetalents.vacina.dtos.UsuarioDto
import br.com.zup.orangetalents.vacina.message.request.UsuarioPostRequest
import br.com.zup.orangetalents.vacina.message.response.UsuarioPostResponse


fun UsuarioDto.toEntity() = Usuario(id, nome, cpf, email, dataNascimento)
fun Usuario.toDto() = UsuarioDto(id, nome, cpf, email, dataNascimento)
fun UsuarioPostRequest.toDto() = UsuarioDto(nome, cpf, email, dataNascimento)
fun UsuarioDto.toResponse() = UsuarioPostResponse(this)

