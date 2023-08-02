import java.util.Comparator;

public class SortStudentByAge implements Comparator<Student> {

	@Override
	public int compare(Student x, Student y) {
		// TODO Auto-generated method stub
		return  x.age - y.age;
	}

}
/**  x ---> Objject to be inserted and y --> already eisting object */
