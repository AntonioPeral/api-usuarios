package com.example.apiusuarios.repository;

import com.example.apiusuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}
