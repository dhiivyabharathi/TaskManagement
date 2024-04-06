package com.example.TaskManagementFinal.Controller;

import com.example.TaskManagementFinal.Data.Task;
import com.example.TaskManagementFinal.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class TaskController {
    @Autowired
    private TaskService taskService;
    @GetMapping("/tasks")
    public String getAllTasks(Model model) {
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "task-list"; // Thymeleaf template name
    }
    // Implement other methods for CRUD operations
}
