package br.com.zup.orangetalents.vacina.entities

import org.hibernate.validator.constraints.br.CPF
import java.time.LocalDate
import javax.persistence.*
import javax.validation.constraints.Email
import javax.validation.constraints.NotNull

@Entity
data class Usuario(
        @Id
        @field:GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @field:NotNull
        var nome: String = "",

        @field:NotNull
        @field:Column(unique = true)
        @field:CPF
        val cpf: String = "",

        @field:NotNull
        @field:Column(unique = true)
        @field:Email
        val email: String = "",

        @field:NotNull
        val dataNascimento: LocalDate = LocalDate.now(),
)


