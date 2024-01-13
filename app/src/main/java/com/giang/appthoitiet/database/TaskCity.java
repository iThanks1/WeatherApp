package com.giang.appthoitiet3.appdb;

public class TaskCity {
    private int taskId;
    private String taskName;

    public TaskCity(int taskId, String taskName ) {
        this.taskId = taskId;
        this.taskName = taskName;

    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

}
