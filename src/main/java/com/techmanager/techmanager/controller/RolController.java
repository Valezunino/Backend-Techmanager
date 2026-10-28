package com.techmanager.techmanager.controller;

import com.techmanager.techmanager.entity.Rol;
import com.techmanager.techmanager.service.RolService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RolController {

    private final RolService rolService;

    public RolController(RolService rolService) {
        this.rolService = rolService;
    }

    @GetMapping
    public List<Rol> listarRoles() {
        return rolService.listarTodos();
    }

    @GetMapping("/{id}")
    public Rol buscarRol(@PathVariable Long id) {
        return rolService.buscarPorId(id)
                .orElseThrow(() -> new IllegalArgumentException("Rol no encontrado"));
    }

    @PostMapping
    public Rol guardarRol(@Valid @RequestBody Rol rol) {
        return rolService.guardar(rol);
    }

    @PutMapping("/{id}")
    public Rol actualizarRol(@PathVariable Long id, @Valid @RequestBody Rol rol) {
        return rolService.actualizar(id, rol);
    }

    @DeleteMapping("/{id}")
    public void eliminarRol(@PathVariable Long id) {
        rolService.eliminar(id);
    }
}
