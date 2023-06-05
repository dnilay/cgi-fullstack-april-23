package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Completed;
import com.example.demo.model.ToDo;
import com.example.demo.repository.ToDoRepository;

import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public class TodoServiceApplication implements CommandLineRunner {

	private ToDoRepository toDoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		toDoRepository.save(new ToDo(1, "Compile", Completed.YES));
		toDoRepository.save(new ToDo(2, "Test", Completed.NO));
		toDoRepository.save(new ToDo(3, "CDeploy", Completed.NO));

	}

}
