package com.examen.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.backend.model.Usuario;
import com.examen.backend.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    };

    public Optional<Usuario> getById(Long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public boolean update(Long id, Usuario usuario) {
        if (usuarioRepository.existsById(id)) {
            Usuario existe = usuarioRepository.findById(id).get();
            existe.setNombre(usuario.getNombre());
            existe.setEmail(usuario.getEmail());
            existe.setPassword(usuario.getPassword());
            usuarioRepository.save(existe);
            return true;
        }
        return false;
    }

    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }
}
