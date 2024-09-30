package com.example.apirest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "autor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Autor extends Base {

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "biografía", length = 1500) //Esta columna va a recibir String de hasta 1500 caracteres
    private String biografia;
}