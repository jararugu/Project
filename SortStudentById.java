import java.util.Comparator;

public class SortStudentById implements Comparator<Student> 
{
	
	public int compare(Student x,Student y)
	{
		return x.id - y.id;
		
	}
/**  x ---> Objject to be inserted and y --> already eisting object */
}
