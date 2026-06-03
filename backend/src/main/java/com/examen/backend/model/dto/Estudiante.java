package com.examen.backend.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Estudiante {

    private int numeroControl;
    private String nombre;
    private String email;
    private Direccion direccion;
    private String telefono;

}
