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
@Table(name = "Localidad")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited

public class Localidad extends Base{
    @Column(name = "denominacion")
    private String denominacion;

}
