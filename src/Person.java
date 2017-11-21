import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Person {
	
	public static void main(String[] args) {
		
		
	
	
	Scanner sc1 = new Scanner(new File ("src/person/namn.txt"));
	Scanner sc2 = new Scanner(new File ("namn.txt"));
	ArrayList<Person> list = new ArrayList<Person>();
	
	while(sc1.hasNetxLine()){
		
		Person p = new Person(sc1.nextLine().trim());
		list.add(p);
		
		
	}
	
	Collections.sort(list);
	

}
}