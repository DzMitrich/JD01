package by.htp3.JD01.Lesson05.Record;

import java.util.ArrayList;
import java.util.List;


public class Book {

	private final List<Record> records = new ArrayList<Record>();

	public void add(Record record) {
		records.add(record);
	}

	public boolean isExists(Record record) {
		return records.contains(record);
	}

	@Override
	public String toString() {
		return records.toString();
	}
}
