package br.com.zup.orangetalents.vacina.data.repository

import br.com.zup.orangetalents.vacina.data.entities.Usuario
import org.springframework.data.repository.CrudRepository


interface ClienteRepository : CrudRepository<Usuario, Long>
