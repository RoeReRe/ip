/**
 * Event represents a task with a start and end date.
 */
public class Event extends Task {
  private String startTime;
  private String endTime;

  public Event(String taskName, String startTime, String endTime) {
    super(taskName);
    this.startTime = startTime;
    this.endTime = endTime;
  }

  @Override
  public String toString() {
    return String.format("[E]%s (from: %s to: %s)", super.toString(), startTime, endTime);
  }
}
