package com.project.appwebgonrod.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.appwebgonrod.entities.Usuario;
import com.project.appwebgonrod.entities.UsuarioRol;
import com.project.appwebgonrod.repositories.RolRepository;
import com.project.appwebgonrod.repositories.UsuarioRepository;
import com.project.appwebgonrod.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    @Override
    public Usuario saveNewUsuario(Usuario usuario, List<UsuarioRol> usuarioRoles) throws Exception {
        Usuario usuarioLocal = usuarioRepository.findByCorreo(usuario.getCorreo());
        
        if (usuarioLocal != null) {
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario ya esta presente");
        } else {
            for (UsuarioRol usuarioRol:usuarioRoles) {
                rolRepository.save(usuarioRol.getRol());
            }
            
            usuario.getUsuariosRoles().addAll(usuarioRoles);
            usuarioLocal = usuarioRepository.save(usuario);
        }
        
        return usuario;
    }

}
