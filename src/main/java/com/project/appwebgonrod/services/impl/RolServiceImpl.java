package com.project.appwebgonrod.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.appwebgonrod.entities.Rol;
import com.project.appwebgonrod.repositories.RolRepository;
import com.project.appwebgonrod.services.RolService;

@Service
public class RolServiceImpl implements RolService {
    @Autowired
    private RolRepository rolRepository;

    @Override
    public Rol saveNewRol(Rol Rol) throws Exception {
        throw new UnsupportedOperationException("Unimplemented method 'saveNewRol'");
    }

    @Override
    public Rol findRolByNombre(String nombre) {
        return rolRepository.findByNombre(nombre);
    }

    @Override
    public void deleteRolById(Long id_rol) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteRolById'");
    }

}
