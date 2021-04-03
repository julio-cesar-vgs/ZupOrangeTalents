package br.com.zup.orangetalents.vacina.mappers

import br.com.zup.orangetalents.vacina.entities.Vacina
import br.com.zup.orangetalents.vacina.dtos.VacinaDto
import br.com.zup.orangetalents.vacina.message.request.VacinaPostRequest
import br.com.zup.orangetalents.vacina.message.response.VacinaPostResponse

fun VacinaDto.toEntity() = Vacina(id, usuario, data)
fun Vacina.toDto() = VacinaDto(id, usuario, data)
fun VacinaPostRequest.toDto() = VacinaDto(usuario, data)
fun VacinaDto.toResponse() = VacinaPostResponse(this)
