package com.tb.directoryapp.repositories;


import com.tb.directoryapp.model.Role;
import org.springframework.data.repository.CrudRepository;


public interface RoleRepository extends CrudRepository<Role, Long> {

    Role getRoleByName(String name);

}

