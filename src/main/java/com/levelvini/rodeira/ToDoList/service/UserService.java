package com.levelvini.rodeira.ToDoList.service;

import com.levelvini.rodeira.ToDoList.repository.TaskRepository;
import com.levelvini.rodeira.ToDoList.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    ModelMapper modelMapper;
    UserRepository repository;

    public UserService(ModelMapper modelMapper, UserRepository repository) {
        this.modelMapper = modelMapper;
        this.repository = repository;
    }
}
