package br.com.zup.orangetalents.vacina.service

import java.util.*

interface IServiceGenerics<T> {
    fun get(): List<T>
    fun getById(id: Long): Optional<T>?
    fun post(t: T) : T
}
