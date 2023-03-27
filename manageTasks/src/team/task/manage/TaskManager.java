package team.task.manage;

import java.util.Scanner;

public class TaskManager {

    private final Scanner scanner;

    public TaskManager(){
        scanner = new Scanner(System.in);
    }

     public void start(){
         while (true){
             System.out.println("==== TASK MANAGER ====");
             System.out.println("1. List tasks");
             System.out.println("2. Add task");
             System.out.println("3. Edit task");
             System.out.println("4. Mark task as complete");
             System.out.println("5. Delete task");
             System.out.println("0. Exit");

             System.out.print("Select an option: ");
             int option = scanner.nextInt();

             switch (option) {
                 case 1 -> System.out.println("loads the methods listTasks()");
                 case 2 -> System.out.println("loads the methods addTask()");
                 case 3 -> System.out.println("loads the methods editTask()");
                 case 4 -> System.out.println("loads the methods markTaskAsComplete()");
                 case 5 -> System.out.println("loads the methods deleteTask()");
                 case 0 -> {
                     System.out.println("loads the methods taskRepository.close()");
                     System.out.println("Exiting...");
                     return;
                 }
                 default -> System.out.println("Invalid option");
             }
             System.out.println();
         }
     }

}
