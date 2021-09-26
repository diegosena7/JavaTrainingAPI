package br.com.training.controller;

import javax.validation.Valid;

import br.com.training.model.dto.UserDTO;
import br.com.training.model.entities.UserEntity;
import br.com.training.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
@RestControllerAdvice
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<UserDTO> createUser(@RequestBody @Valid UserDTO userDTO) {
		return ResponseEntity.ok().body(service.createUser(userDTO));
	}

	@GetMapping (value = "/{cpf}")
	@ResponseStatus(HttpStatus.OK)
	public UserEntity getUser (@PathVariable String cpf){
		return service.listUserByCPF(cpf);
	}

	@GetMapping
	public List<UserEntity> findAllUsers(){
		return service.listAllUsers();
	}

	@DeleteMapping(value = "/{idUserDeleted}")
	public ResponseEntity<UserEntity> deleteUser(@PathVariable("idUserDeleted") Long idUserDeleted) {
		service.deleteUser(idUserDeleted);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}
