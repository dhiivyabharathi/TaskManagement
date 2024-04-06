package com.example.TaskManagementFinal.Data;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Date deadline;
    private String category;
    private String priority;
    private String comment;
    private boolean completed;

    public Task(Long id, String description, Date deadline, String category, String priority, String comment, boolean completed) {
        this.id = id;
        this.description = description;
        this.deadline = deadline;
        this.category = category;
        this.priority = priority;
        this.comment = comment;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public String getCategory() {
        return category;
    }

    public String getPriority() {
        return priority;
    }

    public String getComment() {
        return comment;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
