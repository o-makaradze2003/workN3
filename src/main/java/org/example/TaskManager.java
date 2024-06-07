package org.example;
import java.util.ArrayList;
import java.util.List;

class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void executeTasks() {
        for (Task task : tasks) {
            task.execute();
        }
    }
}