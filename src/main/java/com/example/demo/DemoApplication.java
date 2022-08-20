package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplicacion.run(DemoApplication.classs, args);

		Task1 t1 = new Task1(description: "Recordar POO", done:false, LocalDate.of(year:2022,month:8, dayOfMonth:19));
		Task1 t2 = new Task1(description:"Conocer Intellij IDEA", done: false, LocalDate.of(year:2022,month:8, dayOfMonth:20));
		Task1 t3 = new Task1(description:"Conocer de Spring Boot", Done: false, LocalDate.of(year:2022,month:8, dayOfMonth:22));
		Task1 t4 = new Task1(description: "Finalzando Tareas...", done: false, LocalDate.of(year:2022,month:8, dayOfMonth:25));
		Task1 t5 = new Task1(description: "Recuperar Finalizado Tareas...", done: false, LocalDate.of(year:2022,month:8, dayOfMonth:20));


		System.out.println("description de la tarea:");
		System.out.println(t1.getDescription());
		System.out.println("fecha de la tarea:");
		System.out.println(t1.getDueDate());
		System.out.println("estado de la tarea realizada:");
		System.out.println(t1.getDone());

	})
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
