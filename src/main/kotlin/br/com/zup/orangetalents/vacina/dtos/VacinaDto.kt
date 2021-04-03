package br.com.zup.orangetalents.vacina.dtos

import br.com.zup.orangetalents.vacina.entities.Usuario
import java.time.LocalDate

data class VacinaDto(
        val id: Long,
        val usuario: Usuario,
        val data: LocalDate
) {
    constructor(usuario: Usuario, data: LocalDate): this(0,usuario, data)
}
