package com.example.ecommerceetapa2.service;

import com.example.ecommerceetapa2.model.Usuario;

import java.util.Optional;

public interface UsuarioService {
    Optional<Usuario> findById(Integer id);

    Optional<Usuario> findByUsername(String username);
}
