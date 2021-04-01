package br.com.zup.orangetalents.vacina.message.request

import java.time.LocalDate

class UsuarioPostRequest(
        val nome: String,
        val email: String,
        val cpf: String,
        val dataNascimento: LocalDate,
)
