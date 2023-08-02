import java.util.Comparator;

public class SortStudentByName  implements Comparator<Student>{

	public int compare(Student x, Student y) {
		// TODO Auto-generated method stub
		return x.name.compareTo(y.name);
	}

	
}
