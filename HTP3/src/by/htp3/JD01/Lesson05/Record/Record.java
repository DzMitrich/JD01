package by.htp3.JD01.Lesson05.Record;

public class Record {

	private String content;
	
	public Record() { }

	public Record(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return content;
	}
}
