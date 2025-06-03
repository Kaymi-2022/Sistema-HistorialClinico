package com.sistema_historial_clinico.sistema_historialClinico.persistence.repository;

import com.sistema_historial_clinico.sistema_historialClinico.persistence.crud.UsuarioCrudRepository;
import com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.model.Usuario;
import com.sistema_historial_clinico.sistema_historialClinico.presentation.dto.UsuarioDTO;
import com.sistema_historial_clinico.sistema_historialClinico.service.interfaces.UsuarioDtoRepository;
import com.sistema_historial_clinico.sistema_historialClinico.util.mapper.UsuarioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioRepository implements UsuarioDtoRepository {

    @Autowired
    private UsuarioCrudRepository usuarioCrudRepository;

    @Autowired
    private UsuarioMapper usuarioMapper;

    @Override
    public List<UsuarioDTO> listaUsuarios() {
        List<Usuario> usuarios = (List<Usuario>) usuarioCrudRepository.findAll();
        return usuarioMapper.toUsuarioDTOList(usuarios);
    }

    @Override
    public UsuarioDTO obtenerUsuario(int usuarioId) {
        Usuario usuario = usuarioCrudRepository.findById(usuarioId).orElse(null);
        return usuarioMapper.toUsuarioDTOList(usuario);
    }

    @Override
    public UsuarioDTO guardarUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuarioEntity = usuarioMapper.toEntity(usuarioDTO);
        return usuarioMapper.toUsuarioDTOList(usuarioCrudRepository.save(usuarioEntity));
    }

    @Override
    public void eliminarUsuario(int usuarioId) {
        usuarioCrudRepository.deleteById(usuarioId);
    }
}
