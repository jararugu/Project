
public class Student {
	
    int  id;
    int age;
    String name;
	/**
	 * @param id
	 * @param age
	 * @param name
	 */
	public Student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public String toString()
	{
		return "ID: "+id+" Age:   "+age+"  name: "+name;
	}
	
	}


