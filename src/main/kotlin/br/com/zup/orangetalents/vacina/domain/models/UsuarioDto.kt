package br.com.zup.orangetalents.vacina.domain.models

import java.time.LocalDate

data class UsuarioDto(
        val id: Long,
        val nome: String,
        val cpf: String,
        val email: String,
        val dataNascimento: LocalDate
) {
    constructor(nome: String,
                cpf: String,
                email: String,
                dataNascimento: LocalDate): this(0,nome, cpf, email, dataNascimento)
}
