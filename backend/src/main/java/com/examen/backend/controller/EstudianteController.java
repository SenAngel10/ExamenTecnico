package com.examen.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.backend.model.dto.ApiResponse;
import com.examen.backend.model.dto.Direccion;
import com.examen.backend.model.dto.Estudiante;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

        @GetMapping
        public ResponseEntity<ApiResponse<List<Estudiante>>> getAll() {
                List<Estudiante> estudiantes = List.of(
                                new Estudiante(1001, "Juan Perez", "juan@mail.com",
                                                new Direccion("Calle Reforma", "Centro", "CDMX"), "5551234567"),
                                new Estudiante(1002, "Maria l.", "maria@mail.com",
                                                new Direccion("Avenida Juarez", "Polanco", "CDMX"), "5557654321"),
                                new Estudiante(1003, "Carlos Garcia", "carlos@mail.com",
                                                new Direccion("Calle 5 de Mayo", "Narvarte", "CDMX"), "5559876543"));

                return ResponseEntity.ok(new ApiResponse<>(200, "Ok", estudiantes));
        }

}
