package com.levelvini.rodeira.ToDoList.service;

import com.levelvini.rodeira.ToDoList.repository.TaskRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    ModelMapper modelMapper;
    TaskRepository repoTask;;

    public TaskService(ModelMapper modelMapper, TaskRepository repoTask) {
        this.modelMapper = modelMapper;
        this.repoTask = repoTask;
    }


}
