package br.com.zup.orangetalents.vacina.controller


import br.com.zup.orangetalents.vacina.dtos.UsuarioDto
import br.com.zup.orangetalents.vacina.mappers.toDto
import br.com.zup.orangetalents.vacina.mappers.toResponse
import br.com.zup.orangetalents.vacina.message.request.UsuarioPostRequest
import br.com.zup.orangetalents.vacina.message.response.UsuarioPostResponse
import br.com.zup.orangetalents.vacina.service.IServiceGenerics
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/usuario")
class UsuarioController(val usuarioService: IServiceGenerics<UsuarioDto>) {

    @GetMapping
    fun get() = ResponseEntity.ok(usuarioService.get())

    @PostMapping
    fun post(@RequestBody @Valid usuarioPost: UsuarioPostRequest): ResponseEntity<UsuarioPostResponse?> {
        return ResponseEntity.ok(usuarioService.post(usuarioPost.toDto()).toResponse())
    }
}


