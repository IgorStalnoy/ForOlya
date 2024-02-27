package org.example.homework2.task6;

import java.util.HashMap;
import java.util.Map;

public class TasksForScheduler {

    private final Map<Integer, String> tasksForScheduler = new HashMap<>();

    public String getTasksForScheduler(int dayNumber) {
        return tasksForScheduler.get(dayNumber);
    }

    public void setTasksForScheduler(int dayNumber, String task) {
        this.tasksForScheduler.put(dayNumber, task);
    }


}
