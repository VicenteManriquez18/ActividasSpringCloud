package com.trabajo.serv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabajo.serv.entities.Usuario;
import com.trabajo.serv.services.usuarioService;

@RestController
@RequestMapping("/api/users")
public class usuarioRestController { 
@Autowired
    private usuarioService service;

    @GetMapping
    public List<Usuario> getAll() { return service.listarUsuarios(); }

    @GetMapping("/{id}")
    public Usuario getById(@PathVariable Long id) { return service.obtenerPorId(id); } 

    @PostMapping
    public Usuario create(@RequestBody Usuario user) { return service.crear(user); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.eliminarUsuario(id); }
}