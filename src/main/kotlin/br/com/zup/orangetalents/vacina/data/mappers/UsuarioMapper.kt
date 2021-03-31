package br.com.zup.orangetalents.vacina.data.mappers

import br.com.zup.orangetalents.vacina.domain.models.UsuarioDomain
import br.com.zup.orangetalents.vacina.data.entities.Usuario
import br.com.zup.orangetalents.vacina.request.UsuarioRequest

fun UsuarioDomain.toEntity() = Usuario(id, nome, cpf, email, dataNascimento)
fun Usuario.toDomain() = UsuarioDomain(id, nome, cpf, email, dataNascimento)
fun UsuarioRequest.toDomain() = UsuarioDomain(nome, cpf, email, dataNascimento)
