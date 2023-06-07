package com.devsuperior.camadasapi.service;

import com.devsuperior.camadasapi.DTO.UserDTO;
import com.devsuperior.camadasapi.entity.User;
import com.devsuperior.camadasapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Transactional(readOnly = true)
    public UserDTO findById(Long id) {
        User entity = repository.findById(id).get();
        UserDTO dto = new UserDTO(entity);
        return dto;
    }

}
