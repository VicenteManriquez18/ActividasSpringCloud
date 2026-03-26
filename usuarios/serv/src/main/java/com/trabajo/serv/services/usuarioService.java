package com.trabajo.serv.services;

import com.trabajo.serv.entities.Usuario;
import java.util.List;

public interface usuarioService {
    List<Usuario> listarUsuarios();
    Usuario obtenerPorId(Long id);
    Usuario crearUsuario(Usuario usuario);
    void eliminarUsuario(Long id);
    Usuario crear(Usuario user);
}