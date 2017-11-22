public class Person2 implements Comparable<Person>{

    private String firstName;
    private String lastName;


    public void Person(String fullname){

        int index = fullname.lastIndexOf(" ");

        this.firstName = fullname.substring(index);
        this.lastName = fullname.substring(0,index-1);



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
    public int compareTo(Person p) {
        // TODO Auto-generated method stub
        return 0;
    }

}