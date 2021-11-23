import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Programee {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("student.txt"));
		
		List<String> students = new ArrayList<String>();
		
		while(in.hasNextLine()) {
			students.add(in.nextLine());
		}
		
		for(int i = 0; i < students.size();i = i + 1) {
			System.out.println("name: " + students.get(i));
		}
		in.close();
	
		
		
		}
		
		
		
	}

