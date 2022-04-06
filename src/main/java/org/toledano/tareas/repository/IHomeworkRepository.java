package org.toledano.tareas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.toledano.tareas.entity.Homework;

@Repository
public interface IHomeworkRepository extends JpaRepository<Homework, Long> {

}
