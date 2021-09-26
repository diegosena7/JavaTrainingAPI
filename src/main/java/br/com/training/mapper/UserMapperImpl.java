package br.com.training.mapper;

import br.com.training.model.dto.UserDTO;
import br.com.training.model.entities.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper{

    @Override
    public UserEntity toEntity(UserDTO userDTO) {

        if(userDTO == null){
            return null;
        }
        UserEntity userEntity = new UserEntity();

        userEntity.setId(userDTO.getId());
        userEntity.setName(userDTO.getName());
        userEntity.setCpf(userDTO.getCpf());
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setBirthDate(userDTO.getBirthDate());

        return userEntity;
    }

    @Override
    public UserDTO toDTO(UserEntity userEntity) {

        if(userEntity == null){
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId(userEntity.getId());
        userDTO.setName(userEntity.getName());
        userDTO.setCpf(userEntity.getCpf());
        userDTO.setEmail(userEntity.getEmail());
        userDTO.setBirthDate(userEntity.getBirthDate());

        return userDTO;
    }
}
