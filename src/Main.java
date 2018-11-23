import java.util.*;

public class Main {

	static Map<String, Student> hashMap = new HashMap<String, Student>();
	static Map<String, Student> linkedHashMap = new LinkedHashMap<String, Student>();
	static List<String> linkedList = new LinkedList<String>();
	static List<String> arrayList = new ArrayList<String>();

	static void createStudents() {
		for (int i = 0; i < 1000; i++) {
			Student student = new Student();
			hashMap.put(student.getName(), student);
			linkedHashMap.put(student.getName(), student);
			linkedList.add(student.getName());
			arrayList.add(student.getName());
		}
	}

	static void sortStudents() {
		long begin = System.currentTimeMillis();
		hashMap.entrySet().stream().sorted(Map.Entry.<String,Student>comparingByKey());
		System.out.println("HashMap sorting time:"+(System.currentTimeMillis()- begin));
		
		begin = System.currentTimeMillis();
		linkedHashMap.entrySet().stream().sorted(Map.Entry.<String,Student>comparingByKey());
		System.out.println("LinkedHashMap sorting time:"+(System.currentTimeMillis()- begin));
		
		begin = System.currentTimeMillis();
		Collections.sort(linkedList);;
		System.out.println("LinkedList sorting time:"+(System.currentTimeMillis()- begin));
		
		begin = System.currentTimeMillis();
		Collections.sort(linkedList);;
		System.out.println("ArrayList sorting time:"+(System.currentTimeMillis()- begin));
	}

	public static void main(String[] args) {
		createStudents();
		sortStudents();
	}

}