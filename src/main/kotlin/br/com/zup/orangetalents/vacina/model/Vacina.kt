package br.com.zup.orangetalents.vacina.model

import com.fasterxml.jackson.annotation.JsonIgnore
import java.time.LocalDate
import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
data class Vacina(
        @Id
        @field:GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,


        @ManyToOne
        val usuario: Usuario,

        @field:NotNull
        val data: LocalDate
)
