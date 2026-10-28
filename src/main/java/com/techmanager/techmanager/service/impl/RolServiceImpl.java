package com.techmanager.techmanager.service.impl;

import com.techmanager.techmanager.entity.Rol;
import com.techmanager.techmanager.repository.RolRepository;
import com.techmanager.techmanager.service.RolService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolServiceImpl implements RolService {

    private final RolRepository rolRepository;

    public RolServiceImpl(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    @Override
    public List<Rol> listarTodos() {
        return rolRepository.findAll();
    }

    @Override
    public Optional<Rol> buscarPorId(Long id) {
        return rolRepository.findById(id);
    }

    @Override
    public Rol guardar(Rol rol) {
        rol.setNombre(rol.getNombre().trim().toUpperCase());
        return rolRepository.save(rol);
    }

    @Override
    public Rol actualizar(Long id, Rol rol) {
        Rol existente = rolRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Rol no encontrado"));
        existente.setNombre(rol.getNombre().trim().toUpperCase());
        return rolRepository.save(existente);
    }

    @Override
    public void eliminar(Long id) {
        if (!rolRepository.existsById(id)) {
            throw new IllegalArgumentException("Rol no encontrado");
        }
        rolRepository.deleteById(id);
    }
}
