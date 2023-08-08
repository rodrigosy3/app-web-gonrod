package com.project.appwebgonrod.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.appwebgonrod.entities.Rol;

public interface RolRepository extends JpaRepository<Rol, Long>{
    public Rol findByNombre(String nombre);
    public Rol findByRango(int rango);
}
