package com.example.apiusuarios.controller;

import com.example.apiusuarios.model.Usuario;
import com.example.apiusuarios.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping
    public List<Usuario> obtenerTodos() {
        return usuarioRepository.findAll();
    }

    @PostMapping
    public Usuario crear(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @PutMapping("/{id}")
    public Usuario actualizar(@PathVariable Long id, @RequestBody Usuario datos) {
        return usuarioRepository.findById(id).map(usuario -> {
            usuario.setNombre(datos.getNombre());
            usuario.setCorreo(datos.getCorreo());
            return usuarioRepository.save(usuario);
        }).orElseThrow();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
    }
}
