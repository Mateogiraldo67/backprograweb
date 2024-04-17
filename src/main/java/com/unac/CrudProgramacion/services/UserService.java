package com.unac.CrudProgramacion.services;

import com.unac.CrudProgramacion.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO saveUser(UserDTO UserDTO);
    List<UserDTO> getUsers();

}
