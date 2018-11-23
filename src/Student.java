import java.util.Random;
public class Student {
	Random rand = new Random(System.currentTimeMillis());
	
	private int age;
	private String name;
	
	String randomName(){
		String name="";
		int length = rand.nextInt(16)+4;
		for(int i =0;i<length;i++) {
			name+=(char)('a'+rand.nextInt(26));
		}
		return name;
		
	}
	
	Student(){
		this.age=rand.nextInt(81)+18;
		this.name=randomName();
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
}