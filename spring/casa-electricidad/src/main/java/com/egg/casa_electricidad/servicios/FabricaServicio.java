package com.egg.casa_electricidad.servicios;

import org.springframework.stereotype.Service;

import com.egg.casa_electricidad.entidades.Fabrica;
import com.egg.casa_electricidad.repositorios.FabricaRepositorio;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FabricaServicio {
  private final FabricaRepositorio fabricaRepositorio;

  public Fabrica guardarFabrica(Fabrica fabrica) {

    return fabricaRepositorio.save(fabrica);
  }
}
