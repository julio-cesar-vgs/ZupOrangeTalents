package br.com.zup.orangetalents.vacina.service

interface IService<T> {
    fun get(): List<T>
    fun get(id: Long): T
    fun post(t: T) : T
    fun put()
    fun delete()

}
