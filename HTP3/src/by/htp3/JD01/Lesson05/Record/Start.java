package by.htp3.JD01.Lesson05.Record;


public class Start {

public static void main(String[] args) {
	Book b = new Book();
	
	Record r1 = new Record();
	r1.setContent("r1");
	Record r2 = new Record("r2");
	Record r3 = new Record();
	r3.setContent("r3");
	Record r4 = new Record();
	r4.setContent("r4");
	Record r5 = new Record();
	r5.setContent("r5");
	Record r6 = new Record();
	r6.setContent("r6");

	b.add(r1);
	b.add(r2);
	b.add(r3);
	b.add(r4);
	b.add(r6);

	System.out.println(b);

	if (b.isExists(r5)) {
		System.out.println("Record ###" + r5 + " in the book");
	}

	b.add(r5);

	if (b.isExists(r5)) {
		System.out.println("Record " + r5 + " in the book");
	}
	
	System.out.println(b);
	
	}
}

