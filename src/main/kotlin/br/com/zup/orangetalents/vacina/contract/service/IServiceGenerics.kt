package br.com.zup.orangetalents.vacina.contract.service

import br.com.zup.orangetalents.vacina.domain.models.UsuarioDto
import java.util.*

interface IServiceGenerics<T> {
    fun get(): List<T>
    fun getById(id: Long): Optional<T>?
    fun post(t: T) : T
}
