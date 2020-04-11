import java.util.ArrayList;

class Student {
	String index;
	String firstName;
	String lastName;
    ArrayList<Integer> grades;

	//TODO constructor

    public Student(String index, String firstName, String lastName, ArrayList<> grades) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }
    //TODO seters & getters

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
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

    public double getAverage() {
        int br=0,zbir=0;
        for (int i = 0; i < grades.size(); i++) {
            zbir += grades[i];
            br++;
        }
        return zbir/br;
	}

	public int ECTSCredits() {
        int br =0;
        for (int i = 0; i < grades.size(); i++) {
            if(grades[i]>5)
            br++;
        }
        return br;
	}

}
