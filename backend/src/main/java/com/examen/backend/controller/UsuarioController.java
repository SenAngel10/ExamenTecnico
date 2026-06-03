package com.examen.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.backend.model.Usuario;
import com.examen.backend.model.dto.ApiResponse;
import com.examen.backend.repository.UsuarioRepository;
import com.examen.backend.service.UsuarioService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public ResponseEntity<ApiResponse<List<Usuario>>> getAll() {
        List<Usuario> usuarios = service.getAll();
        return ResponseEntity.ok(new ApiResponse<>(200, "ok", usuarios));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<Usuario>> getUsuario(@PathVariable Long id) {
        return service.getById(id)
                .map(u -> ResponseEntity.ok(new ApiResponse<>(200, "ok", u)))
                .orElse(ResponseEntity.status(404).body(new ApiResponse<>(404, "Usuario no Encontrado", null)));
    }

    @PostMapping()
    public ResponseEntity<ApiResponse<Usuario>> save(@RequestBody Usuario entity) {
        Usuario saved = service.save(entity);
        return ResponseEntity.status(201).body(new ApiResponse<>(201, "Usuario Creado", saved));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> update(@PathVariable Long id, @RequestBody Usuario entity) {

        boolean updated = service.update(id, entity);
        if (updated) {
            return ResponseEntity.ok(new ApiResponse<>(200, "Usuario actualizado", null));
        }
        return ResponseEntity.ok(new ApiResponse<>(404, "Usuario no encontrado", null));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.status(204).build();
    }

}
