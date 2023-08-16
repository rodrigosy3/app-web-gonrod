package com.project.appwebgonrod.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "usuarioRoles")
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id_usuario;

    @NotBlank
    @Size(min = 2)
    @Column(name = "nombres", nullable = false, length = 200)
    private String nombres;

    @NotBlank
    @Size(min = 2)
    @Column(name = "apellidos", nullable = false, length = 200)
    private String apellidos;
    
    @NotBlank
    @Size(min = 8, max = 8)
    @Column(name = "dni", nullable = false, length = 8)
    private String dni;

    @NotBlank
    @Size(min = 9, max = 9)
    @Column(name = "celular", nullable = false, length = 9)
    private String celular;
    
    @NotBlank
    @Email
    @Size(min = 2)
    @Column(name = "correo", nullable = false, length = 100)
    private String correo;

    @NotBlank
    @Size(min = 6)
    @Column(name = "contrasena", nullable = false, length = 100)
    private String contrasena;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<UsuarioRol> usuarioRoles = new ArrayList<>();
}
