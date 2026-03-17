
public class Tasks {
	
	private int code;
	private String title;
	
	public Tasks(int code, String title) {
		this.code = code;
		this.title = title;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	@Override //sobrescreve
	public String toString() {
		return "Task List: [Code: " + code + " - Title: " + title + "]";
	}
}
