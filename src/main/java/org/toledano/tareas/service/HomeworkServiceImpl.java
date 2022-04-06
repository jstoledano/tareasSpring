package org.toledano.tareas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.toledano.tareas.entity.Homework;
import org.toledano.tareas.repository.IHomeworkRepository;

import java.util.List;

@Service
public class HomeworkServiceImpl implements IHomeworkService {

    @Autowired
    private IHomeworkRepository homeworkRepository;

    @Override
    public List<Homework> listAllHomeworks() {
        return homeworkRepository.findAll();
    }
}
