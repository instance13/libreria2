package com.egg.casa_electricidad.servicios;

import org.springframework.stereotype.Service;

import com.egg.casa_electricidad.entidades.Articulo;
import com.egg.casa_electricidad.repositorios.ArticuloRepositorio;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticuloServicio {
  private final ArticuloRepositorio articuloRepositorio;
  private NroArticuloServicio nroArticuloServicio;

  @Transactional
  public Articulo createArticulo(String nombre) {
    Articulo articulo = new Articulo();
    articulo.setNombreArticulo(nombre);

    // Get next unique number
    int nextNro = nroArticuloServicio.getNextArticuloNumber();
    articulo.setNroArticulo(nextNro);

    return articuloRepositorio.save(articulo);
  }
}
