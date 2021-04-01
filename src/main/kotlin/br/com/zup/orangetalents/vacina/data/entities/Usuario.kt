package br.com.zup.orangetalents.vacina.data.entities

import org.hibernate.validator.constraints.br.CPF
import java.time.LocalDate
import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
data class Usuario(
        @Id
        @field:GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @field:NotNull
        val nome: String,

        @field:NotNull
        @field:Column(unique = true)
        @field:CPF
        val cpf: String,

        @field:NotNull
        @field:Column(unique = true)
        val email: String,

        @field:NotNull
        val dataNascimento: LocalDate = LocalDate.now(),
)


