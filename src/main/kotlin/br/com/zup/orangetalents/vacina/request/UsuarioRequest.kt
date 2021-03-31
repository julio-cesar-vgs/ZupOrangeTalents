package br.com.zup.orangetalents.vacina.request

import org.hibernate.validator.constraints.br.CPF
import java.time.LocalDate
import javax.validation.constraints.Email
import javax.validation.constraints.NotNull

class UsuarioRequest(
        val nome: String,
        val email: String,
        val cpf: String,
        val dataNascimento: LocalDate,
)
