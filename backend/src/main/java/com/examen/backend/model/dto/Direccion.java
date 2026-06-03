package com.examen.backend.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Direccion {

    private String calle;
    private String colonia;
    private String ciudad;
}
