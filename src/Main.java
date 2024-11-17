// If using packages
// package com.example.app;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int id = 1;
        String[] section = {"Title", "Completion"};
        String[] Values = {"Gaming", "True"};

        editTask(id, section, Values);
    }

    static void editTask(int taskID, String[] section, String[] newValue){
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("study");
        tasks.add("Work");
        tasks.add("Clean");
        tasks.add("School");
        String taskToEdit = null;
        int amountOfSection = 0;
        for (String t : tasks){
            if (taskID == taskID){
                taskToEdit = t;
            }
        }
        if (taskToEdit == null){
            System.out.println("Task not found");
        }

        for (String nums : section){
            amountOfSection += 1;
        }

        System.out.println("Amount of Section: " + amountOfSection);

    }
}
