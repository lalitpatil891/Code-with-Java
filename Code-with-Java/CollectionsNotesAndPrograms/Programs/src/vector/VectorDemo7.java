//To Do List using vector and switch case

package vector;

import java.util.Scanner;
import java.util.Vector;

public class VectorDemo7 {

	public static void main(String[] args) {

		Vector<String> toDoList = new Vector<String>();

		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("To Do List Menu:");
			System.out.println("1. Add Task");
			System.out.println("2.View Tasks");
			System.out.println("3. Mark Task as Completed");
			System.out.println("4. Exit");

			System.out.println("Enter Your Choice:");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				// Add Task
				System.out.println("Enter task description:");
				String task = sc.nextLine();
				toDoList.add(task);
				System.out.println("Task Added Successfully!\n");

			case 2:
				// View Tasks
				System.out.println("To Do List:");
				if (toDoList.isEmpty()) {
					System.out.println("To Do List is Empty..No Task Found..!");
				} else {
					for (int i = 0; i < toDoList.size(); i++) {
						System.out.println((i + 1) + ". " + toDoList.get(i));
					}
					System.out.println();
				}
				break;

			case 3:
				// Mark task as Completed
				System.out.println("Enter task number to mark as completed:");

				int taskNumber = sc.nextInt();
				if (taskNumber >= 1 && taskNumber <= toDoList.size()) {
					String completedTask = toDoList.remove(taskNumber - 1);
					System.out.println("Task marked as completed: " + completedTask);
				} else {
					System.out.println("Invalid task number!\n");
				}
				break;

			case 4:
				System.out.println("Exiting ToDo List Appllication... GoodBye!");
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid Option.\n");
			}

		} while (choice != 4);
		sc.close();
	}
}
