package br.com.zup.orangetalents.vacina.data.mappers

import br.com.zup.orangetalents.vacina.data.entities.Vacina
import br.com.zup.orangetalents.vacina.domain.models.VacinaDto
import br.com.zup.orangetalents.vacina.message.request.VacinaPostRequest

fun VacinaDto.toEntity() = Vacina(id, usuario, data)
fun Vacina.toDto() = VacinaDto(id, usuario, data)
fun VacinaPostRequest.toDto() = VacinaDto(usuario, data)
