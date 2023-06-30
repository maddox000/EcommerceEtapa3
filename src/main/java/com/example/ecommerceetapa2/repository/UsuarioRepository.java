package com.example.ecommerceetapa2.repository;

import com.example.ecommerceetapa2.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    //Optional<Usuario> findByUsername(String );
}
