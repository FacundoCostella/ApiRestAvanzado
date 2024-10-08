package com.example.apirest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Libro")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Audited

public class Libro extends Base{

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "fecha")
    private int fecha;

    @Column(name = "genero")
    private String genero;

    @Column(name = "paginas")
    private int paginas;

    //Relacion
    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;
}
