package br.com.training.mapper;

import br.com.training.model.dto.UserDTO;
import br.com.training.model.entities.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity toEntity(UserDTO userDTO);
    UserDTO toDTO(UserEntity user);
}
