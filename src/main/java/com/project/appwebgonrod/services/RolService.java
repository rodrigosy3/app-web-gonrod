package com.project.appwebgonrod.services;

import com.project.appwebgonrod.entities.Rol;

public interface RolService {
    public Rol saveNewRol(Rol Rol) throws Exception;    
    
    public Rol findRolByNombre(String nombre);

    public void deleteRolById(Long id_rol);
}
