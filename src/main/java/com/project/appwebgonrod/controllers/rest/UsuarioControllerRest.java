package com.project.appwebgonrod.controllers.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.appwebgonrod.entities.Rol;
import com.project.appwebgonrod.entities.Usuario;
import com.project.appwebgonrod.entities.UsuarioRol;
import com.project.appwebgonrod.services.RolService;
import com.project.appwebgonrod.services.UsuarioService;

@RestController
@RequestMapping("/rest/usuarios")
public class UsuarioControllerRest {
    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private RolService rolService;

    @PostMapping("/crear-usuario")
    public  Usuario saveUsuario(@RequestBody Usuario usuario) throws Exception {
        // Usuario usuarioLocal = usuarioService.findUsuarioByCorreo(usuario.getCorreo());

        // if (usuarioLocal == null) {
        //     return ResponseEntity.noContent().build();
        // }

        List<UsuarioRol> usuarioRoles = new ArrayList<>();

        // Rol rol1 = rolService.findRolByNombre("MESERO");

        // UsuarioRol usuarioRol = new UsuarioRol();
        // usuarioRol.setRol(rol1);
        // usuarioRol.setUsuario(usuario);

        return usuarioService.saveNewUsuario(usuario, usuarioRoles);
    }

    @GetMapping("/buscar-por-correo/{correo}")
    public Usuario getUsuarioByCorreo(@PathVariable("correo") String correo) {
        return usuarioService.findUsuarioByCorreo(correo);
    }

    @DeleteMapping("/eliminar-por-id/{id_usuario}")
    public void deleteUsuarioById(@PathVariable("id_usuario") Long id_usuario) {
        usuarioService.deleteUsuarioById(id_usuario);
    }
}
