package com.example.ecommerceetapa2.service;

import com.example.ecommerceetapa2.model.Usuario;
import com.example.ecommerceetapa2.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioImplement implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public Optional<Usuario> findById(Integer id) {return usuarioRepository.findById(id);}

    @Override
    public Optional<Usuario> findByUsername(String username) {
        //return usuarioRepository.findByUsername(username);
        return null;
    }
}
