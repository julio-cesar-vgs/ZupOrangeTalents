package br.com.zup.orangetalents.vacina.message.request

import br.com.zup.orangetalents.vacina.data.entities.Usuario
import java.time.LocalDate

class VacinaPostRequest(
        val usuario: Usuario,
        val data: LocalDate
)
