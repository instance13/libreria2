package com.egg.casa_electricidad.entidades;

import java.util.UUID;

import com.egg.casa_electricidad.enumeraciones.Rol;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // Generates getters, setters, toString, equals, and hashCode
@NoArgsConstructor // Generates a no-args constructor (required by JPA)
@AllArgsConstructor // Generates a constructor with all args
@Builder // Implements the Builder pattern for this class
public class Usuario {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID idUsuario;
  @NotNull
  @Column(unique = true)
  private String email;
  @NotNull
  private String nombre;
  @NotNull
  private String apellido;
  @NotNull
  private String password;
  @Enumerated(EnumType.STRING)
  private Rol rol;
}
