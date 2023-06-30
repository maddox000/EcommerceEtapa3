package com.example.ecommerceetapa2.service;

import com.example.ecommerceetapa2.model.DetalleOrden;
import com.example.ecommerceetapa2.repository.DetalleOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleOrdenImplement implements DetalleOrdenService{

    @Autowired
    private DetalleOrdenRepository detalleOrdenRepository;

    @Override
    public DetalleOrden save(DetalleOrden detalleOrden) {return detalleOrdenRepository.save(detalleOrden);}
}
