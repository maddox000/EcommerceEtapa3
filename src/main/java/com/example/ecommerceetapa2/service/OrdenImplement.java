package com.example.ecommerceetapa2.service;

import com.example.ecommerceetapa2.model.Orden;
import com.example.ecommerceetapa2.model.Usuario;
import com.example.ecommerceetapa2.repository.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrdenImplement implements OrdenService {

    @Autowired
    private OrdenRepository ordenRepository;

    @Override
    public List<Orden> findAll() {
        return ordenRepository.findAll();
    }

    @Override
    public Orden save(Orden orden) {
        return null;
    }

    @Override
    public String generarNumeroOrden() {
        int numero;
        String numeroConcatenado="";
        List<Orden> ordenes = findAll();
        List<Integer> numeros= new ArrayList<>();
        ordenes.forEach(o -> numeros.add( Integer.parseInt( o.getNumero())));
        if (ordenes.isEmpty()) {
            numero=1;
        }else {
            numero= numeros.stream().max(Integer::compare).get();
            numero++;
        }
        if (numero<10) { //0000001000
            numeroConcatenado="000000000"+ numero;
        }else if(numero<100) {
            numeroConcatenado="00000000"+ numero;
        }else if(numero<1000) {
            numeroConcatenado="0000000"+ numero;
        }else if(numero<10000) {
            numeroConcatenado="0000000"+ numero;
        }
        return numeroConcatenado;
    }


    @Override
    public List<Orden> findByUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public Optional<Orden> findById(Integer id) {
        return ordenRepository.findById(id);
    }
}
