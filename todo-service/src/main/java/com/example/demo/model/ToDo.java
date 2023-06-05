package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "todo_table")
public class ToDo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "todo_id")
	private int toDoId;
	@Column(name = "todo_name")
	private String toDoName;
	@Column(name = "completed")
	
	@Enumerated(EnumType.STRING)
	private Completed isCompleted;

}
