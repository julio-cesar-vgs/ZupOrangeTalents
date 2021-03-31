package br.com.zup.orangetalents.vacina.data.entities

import br.com.zup.orangetalents.vacina.data.entities.Usuario
import java.time.LocalDate
import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
data class Vacina(
        @Id
        @field:GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @ManyToOne
        @JoinColumn(name = "usuario_id")
        val usuario: Usuario,

        @field:NotNull
        val data: LocalDate
)
