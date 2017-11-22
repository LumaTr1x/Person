import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Person implements Comparable<Person>{

	private String firstName;
	private String lastName;

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("namn.txt"));
		ArrayList<Person> list = new ArrayList<Person>();

		while (sc.hasNextLine()) {

			Person p = new Person(sc.nextLine().trim());
			list.add(p);
		}
		
		Collections.sort(list);

	}

	public Person(String name){

        int index = name.lastIndexOf(" ");

        this.firstName = name.substring(index);
        this.lastName = name.substring(0,index-1);

    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    { 

    }

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}
}