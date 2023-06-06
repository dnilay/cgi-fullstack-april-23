package com.example.demo.service;


import com.example.demo.model.ToDo;

public interface TODoService {
	
	public ToDo createToDo(ToDo toDo);
	
	public  Iterable<ToDo> fetchAllToDos();

}
