import dependencies.Task;
import dependencies.Node;

public class TaskLinkedList {
  private Node head;

  public TaskLinkedList() {
    this.head = null;
  }

  public void addTask(Task task) {
    Node newNode = new Node(task);
    if (head == null) {
      head = newNode;
    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }
  }

  public Task searchTask(int taskId) {
    Node temp = head;
    while (temp != null) {
      if (temp.task.getTaskId() == taskId) {
        return temp.task;
      }
      temp = temp.next;
    }
    return null;
  }

  public void traverse() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.task);
      temp = temp.next;
    }
  }

  public void deleteTask(int taskId) {
    if (head == null) {
      return;
    }

    if (head.task.getTaskId() == taskId) {
      head = head.next;
      return;
    }

    Node temp = head;
    while (temp.next != null && temp.next.task.getTaskId() != taskId) {
      temp = temp.next;
    }

    if (temp.next != null) {
      temp.next = temp.next.next; // Bypass the node to delete it
    }
  }

  public static void main(String[] args) {
    TaskLinkedList taskList = new TaskLinkedList();

    // Add tasks
    taskList.addTask(new Task(1, "Task 1", "Incomplete"));
    taskList.addTask(new Task(2, "Task 2", "Complete"));
    taskList.addTask(new Task(3, "Task 3", "Incomplete"));

    // Traverse and print tasks
    System.out.println("All tasks:");
    taskList.traverse();

    // Search for a task
    Task foundTask = taskList.searchTask(2);
    if (foundTask != null) {
      System.out.println("Found task: " + foundTask);
    } else {
      System.out.println("Task not found");
    }

    // Delete a task
    taskList.deleteTask(2);
    System.out.println("Tasks after deletion:");
    taskList.traverse();
  }
}
