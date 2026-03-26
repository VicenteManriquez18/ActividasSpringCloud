package com.trabajo.serv.repositories;

import org.springframework.stereotype.Repository;

import com.trabajo.serv.entities.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface usuarioRepository extends JpaRepository<Usuario, Long>{
    
}
