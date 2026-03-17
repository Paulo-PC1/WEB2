import java.util.ArrayList;
import java.util.List;

public class TaskManager {
	
	private List<Tasks> taskList;
	
	public TaskManager() {
		taskList = new ArrayList<>();
	}
	
	public List<Tasks> getTaskList() {
		return taskList;
	}
	
	public boolean saveTask(Tasks task) {
		if(task != null) {
			taskList.add(task);
			return true;
		}
		return false;
	}
	
	public boolean removeTask(int code) {
		for (Tasks task : taskList) {
			if(task != null) {
				taskList.remove(task);
				return true;
			}
		}
		return false;
	}
}
