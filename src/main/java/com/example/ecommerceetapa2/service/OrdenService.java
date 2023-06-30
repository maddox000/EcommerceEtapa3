package com.example.ecommerceetapa2.service;

import com.example.ecommerceetapa2.model.Orden;
import com.example.ecommerceetapa2.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface OrdenService {

    List<Orden> findAll();

    Optional<Orden> findById(Integer id);

    Orden save(Orden orden);

    String generarNumeroOrden();

    List<Orden> findByUsuario(Usuario usuario);
}
