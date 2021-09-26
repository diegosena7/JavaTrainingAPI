package br.com.training.service;

import br.com.training.mapper.UserMapperImpl;
import br.com.training.model.dto.UserDTO;
import br.com.training.model.entities.UserEntity;
import br.com.training.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    @Autowired
    UserMapperImpl userMapper;

    public List<UserEntity> listAllUsers(){
        return repository.findAll();
    }

    public UserEntity listUserByCPF(String cpf){
        return repository.findByCpf(cpf);
    }

    public UserDTO createUser(UserDTO userDTOCreated){
        UserEntity entity = userMapper.toEntity(userDTOCreated);
        UserEntity entitySaved = repository.save(entity);
        return userMapper.toDTO(entitySaved);
    }

    public void deleteUser(Long idUser){
        repository.deleteById(idUser);
    }
}
