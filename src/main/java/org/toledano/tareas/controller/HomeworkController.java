package org.toledano.tareas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.toledano.tareas.service.IHomeworkService;

@Controller
public class HomeworkController {
    @Autowired
    private IHomeworkService homeworkService;

    @GetMapping({"/homework", "/"})
    public String listAllHomeworks(Model model) {
        model.addAttribute("homeworks", homeworkService.listAllHomeworks());
        return "homework/list";
    }

}
