package com.example.apirest.repositories;

import com.example.apirest.entity.Autor;
import org.springframework.stereotype.Repository;

@Repository                                //Tipo de Entidad , Tipo de ID
public interface AutorRepository extends BaseRepository<Autor, Long> {
}
