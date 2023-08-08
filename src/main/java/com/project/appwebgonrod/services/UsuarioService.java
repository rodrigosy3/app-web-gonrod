package com.project.appwebgonrod.services;

import java.util.List;

import com.project.appwebgonrod.entities.Usuario;
import com.project.appwebgonrod.entities.UsuarioRol;

public interface UsuarioService {
    public Usuario saveNewUsuario(Usuario usuario, List<UsuarioRol> usuarioRoles) throws Exception;    
}
