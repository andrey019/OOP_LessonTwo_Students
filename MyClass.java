import java.util.Date;

public class MyClass {

	public static void main(String[] args) {
		StudentList sl = new StudentList();
		
		sl.add(new Student("Seva", "Evgienko", new Date(1986, 1, 1)));
		sl.add(new Student("Vasya", "Pupkin", new Date(1970, 3, 28)));
		
		int n = sl.findName("Seva");
		System.out.println(sl.get(n).getBirth().toString());

        sl.add(new Student("Arnold", "Schwarzenegger", new Date(1956, 5, 4)));
        sl.add(new Student("Ronnie", "Coleman", new Date(1966, 8, 15)));

        sl.deleteByIndex(3);
        sl.deleteByIndex(0);

	}
}
