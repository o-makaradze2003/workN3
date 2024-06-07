package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
    EmailTask email=new EmailTask("book","petre","random");
    SmsTask sm=new SmsTask(555,"codeofbox");
    TaskManager taskManager=new TaskManager();
    taskManager.addTask(email);
    taskManager.addTask(sm);
    taskManager.executeTasks();
    }
    }
