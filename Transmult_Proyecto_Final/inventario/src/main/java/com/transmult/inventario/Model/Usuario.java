package com.transmult.inventario.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;

    @NotBlank(message = "El nombre de usuario es obligatorio")
    private String usuario;

    @NotBlank(message = "La contraseña es obligatoria")
    private String contraseña;
    
    private String rol;

    // 👇 NUEVO CAMPO
    private LocalDateTime ultimoAcceso;
}

