package dependencies;

public class Node {
  public Task task;
  public Node next;

  public Node(Task task) {
    this.task = task;
    this.next = null;
  }
}
