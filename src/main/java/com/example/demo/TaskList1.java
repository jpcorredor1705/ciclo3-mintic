package com.example.demo;

public class TaskList1 {

    public void printTasks(){
        this.task1List.forEach(task->{
            System.out.println("description: ");
            System.out.println(task.getDescription());
            System.out.println("fecha: ");
            System.out.println(task.getDueDate());
            System.out.println("realizada: ");
            System.out.println(task.getDone());
            System.out.println("-------------------------------");
        });

    }
