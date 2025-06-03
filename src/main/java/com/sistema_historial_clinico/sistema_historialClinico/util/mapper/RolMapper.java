package com.sistema_historial_clinico.sistema_historialClinico.util.mapper;

import com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.model.Rol;
import com.sistema_historial_clinico.sistema_historialClinico.presentation.dto.RolDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface RolMapper {
  //---Mapeo Rol -> Dto
  RolDTO toDTo(Rol rol);

  //---Mapeo Dto -> Entidad
  @Mapping(target = "nivelPermisos", ignore = true)
  @Mapping(target = "fechaCreacion", ignore = true)
  @Mapping(target = "usuarios", ignore = true)
  @Mapping(target = "rolPermisos", ignore = true)
  Rol toEntity(RolDTO rolDTO);
}
