package br.com.training.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String email;

    private String cpf;

    private LocalDate birthDate;
}
