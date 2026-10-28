package com.techmanager.techmanager.service;

import com.techmanager.techmanager.entity.Rol;

import java.util.List;
import java.util.Optional;

public interface RolService {

    List<Rol> listarTodos();

    Optional<Rol> buscarPorId(Long id);

    Rol guardar(Rol rol);

    Rol actualizar(Long id, Rol rol);

    void eliminar(Long id);
}
