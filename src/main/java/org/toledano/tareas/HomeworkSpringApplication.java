package org.toledano.tareas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.toledano.tareas.entity.Homework;
import org.toledano.tareas.repository.IHomeworkRepository;

@SpringBootApplication
public class HomeworkSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HomeworkSpringApplication.class, args);
	}

	@Autowired
	private IHomeworkRepository homeworkRepository;

	@Override
	public void run(String... args) throws Exception {
//		Homework hw1 = new Homework("1445", "03", "02", "Plan de Sprints");
//		homeworkRepository.save(hw1);
//
//		Homework hw2 = new Homework("0383", "03", "01", "Presentación de la Unidad");
//		homeworkRepository.save(hw2);
//
//		Homework hw3 = new Homework("1446", "03", "04", "Ejercicios de probabilidad");
//		homeworkRepository.save(hw3);
	}
}
