package com.project.appwebgonrod.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.appwebgonrod.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    public Usuario findByNombres(String nombres);
    public Usuario findByApellidos(String apellidos);
    public Usuario findByDni(String dni);
    public Usuario findByCelular(String celular);
    public Usuario findByCorreo(String correo);
}
