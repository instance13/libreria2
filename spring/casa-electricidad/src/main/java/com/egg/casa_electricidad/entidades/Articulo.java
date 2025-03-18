package com.egg.casa_electricidad.entidades;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "articulo")
@Data // Generates getters, setters, toString, equals, and hashCode
@NoArgsConstructor // Generates a no-args constructor (required by JPA)
@AllArgsConstructor // Generates a constructor with all args
@Builder // Implements the Builder pattern for this class: custom instantiation
public class Articulo {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID idArticulo;

  @OneToOne
  @JoinColumn(name = "nroArticulo")
  private int nroArticulo;

  @NotNull
  @Column(unique = true)
  private String nombreArticulo;

  @NotNull
  private String descripcionArticulo;

  @ManyToOne
  @JoinColumn(name = "idFabrica")
  private Fabrica fabrica;
}