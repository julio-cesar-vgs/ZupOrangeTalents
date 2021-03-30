package br.com.zup.orangetalents.vacina.repository

import br.com.zup.orangetalents.vacina.model.Usuario
import org.springframework.data.repository.CrudRepository


interface ClienteRepository : CrudRepository<Usuario, Long>
