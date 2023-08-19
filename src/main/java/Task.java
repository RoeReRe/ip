import java.util.ArrayList;

public class Task {
  public static ArrayList<Task> taskList = new ArrayList<>();
  private String taskName;
  private boolean isDone;

  public Task(String taskName) {
    this.taskName = taskName;
    this.isDone = false;
  }

  public static void addTask(Task task) {
    taskList.add(task);
    Duke.printLine();
    System.out.printf("added: %s\n%n", task.getTaskName());
    Duke.printLine();
  }

  public static void markTask(int i) {
    taskList.get(i - 1).isDone = true;
    Duke.printLine();
    System.out.println("Nice! I've marked this task as done:");
    System.out.println(taskList.get(i - 1).toString());
  }

  public static void unmarkTask(int i) {
    taskList.get(i - 1).isDone = false;
    System.out.println("OK, I've marked this task as not done yet:");
    System.out.println(taskList.get(i - 1).toString());
  }

  public static void listTasks() {
    Duke.printLine();
    System.out.println("Here are the tasks in your list:");
    for (int i = 0; i < taskList.size(); i++) {
      System.out.printf("%s.%s %s%n",
          i + 1,
          taskList.get(i).getStatusIcon(),
          taskList.get(i).getTaskName());
    }
    System.out.println();
    Duke.printLine();
  }

  private String getTaskName() {
    return this.taskName;
  }

  private String getStatusIcon() {
    return this.isDone ? "[X]" : "[ ]";
  }

  public String toString() {
    return String.format("%s %s", this.getStatusIcon(), this.getTaskName());
  }
}
