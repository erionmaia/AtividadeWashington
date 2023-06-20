package com.taskmanager.easytask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.taskmanager.easytask.entities.List;
import com.taskmanager.easytask.entities.Tarefa;
import com.taskmanager.easytask.entities.User;

@SpringBootApplication
public class EasytaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasytaskApplication.class, args);
	}
	
	List list = new List();
	User user = new User();
	Tarefa taks = new Tarefa();
	
	


}
