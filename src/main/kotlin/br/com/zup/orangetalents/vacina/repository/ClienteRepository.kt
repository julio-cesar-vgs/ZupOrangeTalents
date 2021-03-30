package br.com.zup.orangetalents.vacina.repository

import br.com.zup.orangetalents.vacina.model.User
import org.springframework.data.repository.CrudRepository


interface ClienteRepository : CrudRepository<User, Long>
