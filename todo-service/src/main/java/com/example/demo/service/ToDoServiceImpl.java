package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.ToDo;
import com.example.demo.repository.ToDoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ToDoServiceImpl implements TODoService {
	private final ToDoRepository toDoRepository;

	@Override
	public ToDo createToDo(ToDo toDo) {
		// TODO Auto-generated method stub
		return toDoRepository.save(toDo);
	}

	@Override
	public Iterable<ToDo> fetchAllToDos() {
		// TODO Auto-generated method stub
		return toDoRepository.findAll();
	}

}
