import java.util.Map;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Collections;




public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Student s1 = new Student(01,20,"guru");
		Student s2 = new Student(02,30,"sudhakr");
		Student s3 = new Student(03,40,"varun");
		
		Map<Integer,Student> map = new LinkedHashMap<Integer,Student>();
		map.put(s1.id,s1);
		map.put(s2.id,s2);
		map.put(s3.id,s3);
		
		/**
		 * Map cannot be sorted based on values, therefore we
		 * are getting the values  from map and adding to List,
		 * so that we can sort the list using Collections.sort()
		 * 
		 */
	
		/**reference variable of list and objects of arraylist
		 to store student objects (UPCASTING)*/
		List<Student> l = new ArrayList<Student>();
		
		
		/** Converting map into set of Keys Using KeySet() */
		Set<Integer> keys = map.keySet();
		
		/** Traversing Keys Using for-each loop */
		for(int key : keys)
		{
		/** getting value (Student Object) from map */	
          Student std =map.get(key)	;
          
          /** adding value (Student Object) into list */
          l.add(std);
          
          /** Printing the Value (Student Object) --> ToString() */
          System.out.println(std);
          
		}
		
		System.out.println("----------------------");
	
		Scanner sc =new Scanner(System.in);

		
		System.out.println("1: sort Syudent By Id\n2:Sort Student By Age");
		System.out.println("3:Sort Student By Name\n Enter CHoice");
		
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			Collections.sort(l, new SortStudentById());
			for(Student s : l)
			{
				System.out.println(s);
			}
			break;
		case 2:
			Collections.sort(l, new SortStudentByAge());
			for(Student s : l)
			{
				System.out.println(s);
			}
			break;
		case 3:
			Collections.sort(l, new SortStudentByName());
			for(Student s : l)
			{
				System.out.println(s);
			}
			break;
			
		}
		sc.close();
		
		
		
		
		

		


	}

}
