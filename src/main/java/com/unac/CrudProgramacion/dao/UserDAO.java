package com.unac.CrudProgramacion.dao;


import com.unac.CrudProgramacion.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<UsersEntity,Integer> {
}
