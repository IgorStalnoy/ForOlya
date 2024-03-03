package org.example.homework2.task6;

import java.util.HashMap;
import java.util.Map;

public class TasksContainer {

    private final Map<Integer, String> tasks = new HashMap<>();

    public String getTasks(int dayNumber) {
        return tasks.get(dayNumber);
    }

    public void addTask(int dayNumber, String task) {
        this.tasks.put(dayNumber, task);
    }


}
