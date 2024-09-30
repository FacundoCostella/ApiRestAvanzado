package com.example.apirest.services;

import com.example.apirest.entity.Base;
import org.aspectj.asm.IProgramElement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, ID extends Serializable> {

    //Metodo que obtiene una lista con todas las entidades (persona) que se encuentran en la Base de Datos
    public List<E> findAll() throws Exception;

    //Método para la paginación
    public Page<E> findAll(Pageable pageable) throws Exception;

    //Metodo que obtiene una persona segun el ID que le pase
    public E findById(ID id) throws Exception;

    //Metodo que crea una entidad
    public E save(E entity) throws Exception;

    //Metodo para actualizar una entidad
    public E update(ID id, E entity) throws Exception;

    //Metodo para eliminar una entidad
    public boolean delete(ID id) throws Exception;
}
