package br.com.zup.orangetalents.vacina.repository

import br.com.zup.orangetalents.vacina.entities.Usuario
import org.springframework.data.repository.CrudRepository


interface UsuarioRepository : CrudRepository<Usuario, Long>
